package com.mateuslima.spring_boot.repositories;

import com.mateuslima.spring_boot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
