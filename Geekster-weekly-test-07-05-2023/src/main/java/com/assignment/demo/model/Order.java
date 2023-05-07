package com.assignment.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/* id:integer
    userID:integer (foreign key mapping)
    productID:integer(foreign key mapping)
    addressID:integer(foreign key mapping)
    productQuantity:integer
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String productQuatity;
	@OneToOne
	private User user;
	
	@OneToOne
	private Product product;
	
	@OneToOne
	private Address address;
}
