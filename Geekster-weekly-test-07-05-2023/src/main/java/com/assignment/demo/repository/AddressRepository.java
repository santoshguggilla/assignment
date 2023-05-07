package com.assignment.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.demo.model.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
