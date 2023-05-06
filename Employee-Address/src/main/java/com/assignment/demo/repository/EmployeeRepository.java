package com.assignment.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.demo.models.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
