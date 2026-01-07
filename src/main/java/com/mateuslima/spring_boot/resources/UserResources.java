package com.mateuslima.spring_boot.resources;

import com.mateuslima.spring_boot.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Mel", "mel@gmail.com", "999999999", "123456");

        return ResponseEntity.ok().body(user);
    }
}
