package tma.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tma.com.dto.CustomerDTO;
import tma.com.model.Customer;
import tma.com.service.ICustomerService;
import tma.com.util.DTO;

@RestController
public class CustomerController {
	
	@Autowired
	private ICustomerService customerService;
	
	@GetMapping(value = "/customers")
	public ResponseEntity<List<Customer>> getAll() {
		return new ResponseEntity<List<Customer>>(customerService.getAll(), HttpStatus.OK);
	}
	
	@PostMapping(value = "/customer")
	public ResponseEntity<Customer> create(@DTO(CustomerDTO.class) Customer customer) {
		Customer customerCreated = customerService.insert(customer);
		if (customerCreated != null) {
			return new ResponseEntity<Customer>(customerCreated, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Customer>(customerCreated, HttpStatus.BAD_REQUEST);
		}
	}
}
