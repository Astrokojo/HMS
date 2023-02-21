package com.Invoice.controllers;

import com.Invoice.models.Customer;
import com.Invoice.services.CustomerImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/customer")
public class CustomerController {
@Autowired
private CustomerImplement service;

    @PostMapping("add")
    public void addCustomer(@RequestBody Customer customer) {
        service.addCustomer(customer);
    }

    @GetMapping("all")
    public List<Customer> getAll() {
        return service.getAllCustomers();
    }
}
