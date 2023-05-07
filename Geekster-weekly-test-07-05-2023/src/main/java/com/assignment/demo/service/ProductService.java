package com.assignment.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.demo.model.Product;
import com.assignment.demo.repository.ProductRepository;
@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}


	public boolean deleteProductById(int id) {
		if(productRepository.getById(id)!=null) {
			productRepository.deleteById(id);
			return true;
		}
		return false;
	}

}
