package com.packt.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.CustomerHero;
import com.packt.webstore.domain.repository.CustomerRepository;
import com.packt.webstore.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<CustomerHero> getAllCustomers() {
		List<CustomerHero> customers = customerRepository.getAllCustomers();
		return customers;
	}

	@Override
	public void addCustomer(Customer newCustomer) {
		// TODO Auto-generated method stub
		
	}

}
