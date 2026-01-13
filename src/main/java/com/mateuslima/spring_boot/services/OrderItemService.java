package com.mateuslima.spring_boot.services;

import com.mateuslima.spring_boot.entities.OrderItem;
import com.mateuslima.spring_boot.entities.pk.OrderItemPK;
import com.mateuslima.spring_boot.repositories.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository orderItemRepository;

    public List<OrderItem> findAll() {
        return orderItemRepository.findAll();
    }

    public OrderItem findById(OrderItemPK id) {
        Optional<OrderItem> obj = orderItemRepository.findById(id);

        return obj.get();
    }
}

