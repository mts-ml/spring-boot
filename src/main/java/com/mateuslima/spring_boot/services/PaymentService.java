package com.mateuslima.spring_boot.services;

import com.mateuslima.spring_boot.entities.Payment;
import com.mateuslima.spring_boot.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public List<Payment> findALl() {
        return paymentRepository.findAll();
    }

    public Payment findById(Long id) {
        Optional<Payment> obj = paymentRepository.findById(id);

        return obj.get();
    }
}
