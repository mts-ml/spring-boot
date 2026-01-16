package com.mateuslima.spring_boot.services;

import com.mateuslima.spring_boot.entities.User;
import com.mateuslima.spring_boot.repositories.UserRepository;
import com.mateuslima.spring_boot.services.exceptions.DatabaseException;
import com.mateuslima.spring_boot.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = userRepository.findById(id);

        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj) {
        return userRepository.save(obj);
    }

    public void delete(Long id) {
        if (!userRepository.existsById(id)) {
            throw new ResourceNotFoundException(id);
        }

        try {
            userRepository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Long id, User obj) {
        try {
            User entity = userRepository.getReferenceById(id);
        /*  Retorna um proxy* gerenciado pelo JPA, sem acessar o banco imediatamente.
        O acesso ao banco ocorre apenas se algum atributo for utilizado.
        É comum em operações de update, pois evita uma consulta desnecessária.  */

            // Proxy é um objeto falso/intermediário, criado pelo Hibernate, que representa a entidade real, mas sem carregar os dados do banco ainda.

            updateData(entity, obj);
            return userRepository.save(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }
    }


    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
