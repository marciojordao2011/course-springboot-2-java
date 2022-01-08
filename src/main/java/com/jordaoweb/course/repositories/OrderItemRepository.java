package com.jordaoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jordaoweb.course.entities.OrderItem;
import com.jordaoweb.course.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
