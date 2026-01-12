package com.mateuslima.spring_boot.resources;

import com.mateuslima.spring_boot.entities.OrderItem;
import com.mateuslima.spring_boot.entities.pk.OrderItemPK;
import com.mateuslima.spring_boot.services.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping(value = "/orderItems")
public class OrderItemResources implements Serializable {

    @Autowired
    private OrderItemService orderItemService;

    @GetMapping
    public ResponseEntity<List<OrderItem>> findAll() {
        List<OrderItem> orderItems = orderItemService.findAll();

        return ResponseEntity.ok().body(orderItems);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<OrderItem> foundById(@PathVariable OrderItemPK id) {
        OrderItem foundOrderItem = orderItemService.findById(id);

        return ResponseEntity.ok().body(foundOrderItem);

    }
}
