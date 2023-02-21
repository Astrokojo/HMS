package com.Invoice.services;

import com.Invoice.repo.CustomerDao;
import com.Invoice.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerImplement implements CustomerInterface{

    @Autowired
    private CustomerDao Customerdao;


    @Override
    public List<Customer> getAllCustomers() {
        return Customerdao.findAll();
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return Customerdao.save(customer);
    }
}
