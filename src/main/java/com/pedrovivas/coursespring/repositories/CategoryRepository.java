package com.pedrovivas.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrovivas.coursespring.entites.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
