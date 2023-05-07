package com.assignment.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.demo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
