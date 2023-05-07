package com.assignment.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.demo.model.Order;
import com.assignment.demo.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public void saveOrder(Order order) {
		// TODO Auto-generated method stub
		orderRepository.save(order);
	}

	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	public Order getOrderById(int id) {
		// TODO Auto-generated method stub
		return orderRepository.getById(id);
	}
}
