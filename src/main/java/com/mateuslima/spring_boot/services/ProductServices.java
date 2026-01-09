package com.mateuslima.spring_boot.services;

import com.mateuslima.spring_boot.entities.Product;
import com.mateuslima.spring_boot.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository productRepository;


    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> foundProduct = productRepository.findById(id);

        return foundProduct.get();
    }
}
