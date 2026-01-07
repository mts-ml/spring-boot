package com.mateuslima.spring_boot.config;

import com.mateuslima.spring_boot.entities.User;
import com.mateuslima.spring_boot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    // Com essa configuração, o Spring faz a injeção de dependência automaticamente
    @Autowired
    // Quando rodar a aplicação o Spring resolve a dependência e associa uma instância de UserRepository aqui dentro
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User("Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User("Alex Green", "alex@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
