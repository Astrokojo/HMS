package com.Invoice.controllers;

import com.Invoice.models.Customer;
import com.Invoice.models.Invoice;
import com.Invoice.services.CustomerImplement;
import com.Invoice.services.InvoiceImplementation;
import com.Invoice.services.InvoiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/invoice")
public class InvoiceController {

@Autowired
private InvoiceImplementation service;
    @PostMapping("add")
    public void addInvoice(@RequestBody Invoice invoice) {
        service.addInvoice(invoice);
    }

    @GetMapping("all")
    public List<Invoice> getAll() {
        return service.getAllInvoices();
    }
}
