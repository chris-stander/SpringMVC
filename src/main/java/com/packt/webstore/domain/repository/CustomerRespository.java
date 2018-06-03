package com.packt.webstore.domain.repository;

import java.util.List;

import com.packt.webstore.domain.CustomerHero;

public interface CustomerRepository {

	List<CustomerHero> getAllCustomers();
	
}
