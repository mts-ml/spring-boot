package com.mateuslima.spring_boot.resources;

import com.mateuslima.spring_boot.entities.Payment;
import com.mateuslima.spring_boot.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResources {

    @Autowired
    private PaymentService paymentService;

    @GetMapping
    public ResponseEntity<List<Payment>> findAll() {
        List<Payment> payments = paymentService.findALl();

        return ResponseEntity.ok().body(payments);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Payment> foundById(@PathVariable Long id) {
        Payment foundPayment = paymentService.findById(id);

        return ResponseEntity.ok().body(foundPayment);
    }
}
