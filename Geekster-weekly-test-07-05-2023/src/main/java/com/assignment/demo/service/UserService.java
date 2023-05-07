package com.assignment.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.demo.model.User;
import com.assignment.demo.repository.UserRepository;
@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userRepository.getById(id);
	}

}
