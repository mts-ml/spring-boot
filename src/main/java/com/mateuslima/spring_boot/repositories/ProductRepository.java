package com.mateuslima.spring_boot.repositories;

import com.mateuslima.spring_boot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
