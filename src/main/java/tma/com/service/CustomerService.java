package tma.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tma.com.model.Customer;
import tma.com.repository.ICustomerRepository;

@Service
public class CustomerService implements ICustomerService{

	@Autowired
	private ICustomerRepository customerRepository;
	
	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		
		return customerRepository.findAll();
	}

	@Override
	public Customer insert(Customer customer) {
		// TODO Auto-generated method stub
		
		return customerRepository.save(customer);
	}
	
}
