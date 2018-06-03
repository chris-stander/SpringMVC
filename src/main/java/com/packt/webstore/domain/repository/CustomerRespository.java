package com.packt.webstore.domain.repository;

import com.packt.webstore.domain.Customer;
import java.util.List;

public interface CustomerRespository {
    
    List<Customer> getAllCustomers();
    void addCustomer(Customer customer);
}