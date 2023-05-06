package com.assignment.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.demo.models.Employee;
import com.assignment.demo.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees(){
		return (List<Employee>) employeeService.getAllEmployees();
	}
	
	@GetMapping("/getEmployee/{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
		return employeeService.getEmployeeById(id);
	}
	
	@PostMapping("/addEmployee")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}
	
	@PutMapping("/updateEmployee/{id}")
	public String updateEmployee(@PathVariable Long id,@RequestBody Employee employee) {
		if(employeeService.updateEmployee(id,employee)) return "Updated Successfully";
		return "Invaild Input";
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployeeById(@PathVariable Long id) {
		if(employeeService.deleteEmployeeById(id)) return "Deleted Successfully";
				return "Invaild Input";
	}

}
