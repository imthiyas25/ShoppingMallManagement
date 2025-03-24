package com.tnsif.customerservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@Autowired
    private CustomerService service;
    
	@PostMapping("/customerservice")
	public void add(@RequestBody Customer cust) {
		service.insertRecord(cust);
	}
	@GetMapping("/customerservice")
	public List<Customer> ShowAll(){
		return service.getAllRecords();
	}
	@GetMapping("/customerservice/{id}")
	public Customer getCustomerById(@PathVariable Integer id)
	{
		return service.getCustomerById(id);
	}
	
	@DeleteMapping("/customerservice/{id}")
	public void deleteCustomer(@PathVariable Integer id)
	{
		service.deleteCustomer(id);
	}
	
	@PutMapping("/customerservice/{id}")
	public ResponseEntity<String> updateCustomer(@PathVariable Integer id,@RequestBody Customer updatedCustomer)
	{
		service.updateCustomer(id,updatedCustomer);
		return ResponseEntity.ok("Customer updated Successfully");
	}
		
}
