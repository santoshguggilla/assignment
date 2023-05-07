package com.assignment.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.demo.model.Order;
import com.assignment.demo.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;

	@PostMapping("/saveOrder")
	public void saveOrder(@RequestBody Order order) {
		orderService.saveOrder(order);
	}
	
	@GetMapping("/getAllOrders")
	public List<Order> getAllOrders(){
		return orderService.getAllOrders();
	}
	
	@GetMapping("/getOrder/{id}")
	public Order getOrderById(@PathVariable int id) {
		return orderService.getOrderById(id);
	}
	
}
