package com.pedrovivas.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrovivas.coursespring.entites.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
