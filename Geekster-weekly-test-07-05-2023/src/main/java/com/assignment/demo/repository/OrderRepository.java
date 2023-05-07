package com.assignment.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.demo.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
