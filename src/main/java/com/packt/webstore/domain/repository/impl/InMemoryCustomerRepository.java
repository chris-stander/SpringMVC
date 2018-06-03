package com.packt.webstore.domain.repository.impl;

import com.packt.webstore.domain.Address;
import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRespository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryCustomerRepository implements CustomerRespository {
    
    List<Customer> customerList;
    {
        customerList = new ArrayList<>();
        customerList.add(new Customer(123L,"Chris Stander"));
        customerList.add(new Customer(124L, "Erin Momsen"));
    }
    
    @Override 
    public List<Customer> getAllCustomers(){
        return customerList;
    }
    
    @Override
    public void addCustomer(Customer customer){
        customerList.add(customer);
    }
}