package com.pedrovivas.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrovivas.coursespring.entites.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
