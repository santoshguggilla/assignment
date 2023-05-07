package com.assignment.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 id:integer 
         name:string
         price:integer
         description:string
       category:string
       brand:string
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private String category;
	private String brand;
	
//	@OneToMany(mappedBy="product")
//	
//	private List<Order> orderList;
}
