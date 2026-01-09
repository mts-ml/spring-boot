package com.mateuslima.spring_boot.resources;

import com.mateuslima.spring_boot.entities.Category;
import com.mateuslima.spring_boot.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryResources {

    @Autowired
    private CategoryServices categoryServices;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> categories =  categoryServices.findAll();

        return ResponseEntity.ok().body(categories);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category foundCategory = categoryServices.findById(id);

        return ResponseEntity.ok().body(foundCategory);
    }
}
