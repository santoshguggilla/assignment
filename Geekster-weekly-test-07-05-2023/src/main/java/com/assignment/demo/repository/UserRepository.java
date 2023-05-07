package com.assignment.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.demo.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
