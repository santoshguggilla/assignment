package com.assignment.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.demo.models.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

	
	
}
