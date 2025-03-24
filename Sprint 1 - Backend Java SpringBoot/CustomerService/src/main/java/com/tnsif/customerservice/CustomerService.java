package com.tnsif.customerservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerService {
	@Autowired
	private CustomerRepository repo;
	
	//Inserting records
	public void insertRecord(Customer cust)
	{
		repo.save(cust);
	}
	
	//Show all the records 
	public List<Customer> getAllRecords()
	{
		return repo.findAll();
	}
	
	//Show specific record 
	public Customer getCustomerById(Integer id)
	{
		return repo.findById(id).orElse(null);
	}
	//Deleting the specific record from the table in database
	public void deleteCustomer(Integer id)
	{
		repo.deleteById(id);
	}
	
	//updating the existing record
	public void updateCustomer(Integer id,Customer updateCustomer)
	{
		Customer existingCustomer=repo.findById(id).orElse(null);
		if(existingCustomer!=null)
		{
			existingCustomer.setCid(updateCustomer.getCid());
			existingCustomer.setCname(updateCustomer.getCname());
			existingCustomer.setAddress(updateCustomer.getAddress());
			repo.save(existingCustomer);
		}
	}
	}

