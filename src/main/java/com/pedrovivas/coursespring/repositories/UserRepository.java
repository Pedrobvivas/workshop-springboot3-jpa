package com.pedrovivas.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrovivas.coursespring.entites.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
