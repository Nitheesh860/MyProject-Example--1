package com.samco.stockNote.allservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samco.stockNote.allmodel.Customer;
import com.samco.stockNote.allrepository.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;

	/*
	 * public List<Customer> returnAllCustomer(Customer customer) { return
	 * customerRepo.findAll(); }
	 */

	/*
	 * public Optional<Customer> getCustomerId(String _id) { return
	 * customerRepo.findById(_id); }
	 */
	public Customer getCustomerId(String id) {

		return customerRepo.fetchByClientId(id);

	}
}