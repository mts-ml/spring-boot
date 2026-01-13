package com.mateuslima.spring_boot.repositories;

import com.mateuslima.spring_boot.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
