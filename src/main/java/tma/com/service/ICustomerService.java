package tma.com.service;

import java.util.List;

import tma.com.model.Customer;

public interface ICustomerService {
	
	public List<Customer> getAll();
	public Customer insert(Customer customer);
}
