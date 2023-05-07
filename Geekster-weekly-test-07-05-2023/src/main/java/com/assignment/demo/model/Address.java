package com.assignment.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*name:string
       landmark:string
       phoneNumber:string
       zipcode:string
       state:string
       UserID : foreign key mapping*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String landmark;
	private String phoneNumber;
	private String zipcode;
	private String state;
	@OneToOne(cascade = CascadeType.ALL)
	private User user;
}
