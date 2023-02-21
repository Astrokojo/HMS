package com.Invoice.services;

import com.Invoice.models.Customer;

import java.util.List;

public interface CustomerInterface {

    List<Customer> getAllCustomers();

    Customer addCustomer(Customer customer);
}
