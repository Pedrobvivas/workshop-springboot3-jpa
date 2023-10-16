package com.pedrovivas.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrovivas.coursespring.entites.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
