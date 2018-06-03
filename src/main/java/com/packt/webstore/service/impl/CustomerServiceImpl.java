package com.packt.webstore.service.impl;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRespository;
import com.packt.webstore.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
    
    @Autowired
    CustomerRespository customerRepo;
    
    @Override
    public List<Customer> getAllCustomers() {
        return customerRepo.getAllCustomers();
    }
    @Override
    public void addCustomer(Customer customer) {
        customerRepo.addCustomer(customer);
    }
    
}