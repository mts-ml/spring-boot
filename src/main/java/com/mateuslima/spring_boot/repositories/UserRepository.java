package com.mateuslima.spring_boot.repositories;

import com.mateuslima.spring_boot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}
