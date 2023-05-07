package com.assignment.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.demo.model.Product;
import com.assignment.demo.service.ProductService;
@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProductById(@PathVariable int id) {
		if(productService.deleteProductById(id)) {
			return "deleted successfully";
		}
		return "Invaild Inventory";
	}
}
