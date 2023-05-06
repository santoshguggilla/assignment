package com.assignment.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.demo.models.Address;
import com.assignment.demo.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;

	public List<Address> getAllAddress() {

		return (List<Address>) addressRepository.findAll();
	}

	public Address getAddressById(Long id) {
		return addressRepository.findById(id).get();
	}

	public void addAddress(Address address) {
		addressRepository.save(address);
	}

	public boolean updateAddress(Long id, Address address) {
		Address oldAddress=getAddressById(id);
		if(oldAddress!=null) {
			if(address.getState()!=null)oldAddress.setState(address.getState());
			if(address.getCity()!=null)oldAddress.setCity(address.getCity());
			if(address.getStreet()!=null)oldAddress.setStreet(address.getStreet());
			if(address.getZipcode()!=null)oldAddress.setZipcode(address.getZipcode());
			addressRepository.save(oldAddress);
			return true;
		}
		return false;
	}

	public boolean deleteAddress(Long id) {
		Address oldAddress=getAddressById(id);
		if(oldAddress!=null) {
			addressRepository.delete(oldAddress);
			return true;
		}
		return false;
	}

	
}
