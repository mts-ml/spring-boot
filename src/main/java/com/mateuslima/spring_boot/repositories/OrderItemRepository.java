package com.mateuslima.spring_boot.repositories;

import com.mateuslima.spring_boot.entities.OrderItem;
import com.mateuslima.spring_boot.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository <OrderItem, OrderItemPK> {

}
