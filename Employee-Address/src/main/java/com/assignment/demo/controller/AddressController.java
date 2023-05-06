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

import com.assignment.demo.models.Address;
import com.assignment.demo.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	private AddressService addressService;
	
	@GetMapping("/getAllAddress")
	public List<Address> getAllAddress(){
		return addressService.getAllAddress();
	}
	
	@GetMapping("/getAddress/{id}")
	public Address getAddressById(@PathVariable Long id) {
		return addressService.getAddressById(id);
	}
	
	@PostMapping("/addAddress")
	public void addAddress(@RequestBody Address address) {
		addressService.addAddress(address);
	}
	
	@PutMapping("/updateAddress/{id}")
	public String updateAddressById(@PathVariable Long id,@RequestBody Address address) {
		if(addressService.updateAddress(id,address)) return "updated Successfully";
		return "Invaid Input";
	}
	
	@DeleteMapping("/deleteAddress/{id}")
	public String deleteAddressById(@PathVariable Long id) {
		if(addressService.deleteAddress(id)) return "deleted Successfully";
		return  "Invaild Input";
	}
}

