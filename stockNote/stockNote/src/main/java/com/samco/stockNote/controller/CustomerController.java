package com.samco.stockNote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samco.stockNote.allmodel.Customer;
import com.samco.stockNote.allservice.CustomerService;

@RestController
@RequestMapping("/Customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	

	/*
	 * @GetMapping public List<Customer> getAllCustomer(Customer customer) { return
	 * customerService.returnAllCustomer(customer);
	 * 
	 * }
	 */
	/*
	 * @GetMapping("/{_id}") public Optional<Customer> getId(@PathVariable ("_id")
	 * String _id){ return customerService.getCustomerId(_id);
	 * 
	 * }
	 */

	@GetMapping("/{client_id}")
	public Customer fetchClientId(@PathVariable("client_id") String client_id) {
		return customerService.getCustomerId(client_id);
	}
	
	
	
	
	
}