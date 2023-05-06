package com.assignment.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.demo.models.Employee;
import com.assignment.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Iterable<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	public Employee getEmployeeById(Long id) {

		return employeeRepository.findById(id).get();
	}

	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	public boolean updateEmployee(Long id, Employee employee) {
		Employee oldEmployee = getEmployeeById(id);
		if (oldEmployee != null) {
			if (employee.getAddress() != null) {
				if (employee.getAddress().getCity() != null)
					oldEmployee.getAddress().setCity(employee.getAddress().getCity());
				if (employee.getAddress().getStreet() != null)
					oldEmployee.getAddress().setStreet(employee.getAddress().getStreet());
				if (employee.getAddress().getState() != null)
					oldEmployee.getAddress().setState(employee.getAddress().getState());
				if (employee.getAddress().getZipcode() != null)
					oldEmployee.getAddress().setZipcode(employee.getAddress().getZipcode());
			}
			if (employee.getFirstName() != null)
				oldEmployee.setFirstName(employee.getFirstName());
			if (employee.getLastName() != null)
				oldEmployee.setLastName(employee.getLastName());
			employeeRepository.save(oldEmployee);
			return true;
		}
		return false;
	}

	public boolean deleteEmployeeById(Long id) {
		Employee oldEmployee = getEmployeeById(id);
		if (oldEmployee != null) {
			employeeRepository.deleteById(id);
			return true;
		}
		return false;
	}
}
