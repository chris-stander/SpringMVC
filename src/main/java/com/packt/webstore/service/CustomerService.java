package com.packt.webstore.service;

import java.util.List;

import com.packt.webstore.domain.CustomerHero;

public interface CustomerService {

	List<CustomerHero> getAllCustomers();
}
