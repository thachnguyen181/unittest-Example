package tma.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tma.com.model.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer>{

}
