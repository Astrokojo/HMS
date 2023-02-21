package com.Invoice.services;

import com.Invoice.models.Invoice;
import com.Invoice.repo.InvoiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceImplementation implements InvoiceInterface{

    @Autowired
    private InvoiceRepo repo;

    @Override
    public Invoice addInvoice(Invoice invoice) {

        return repo.save(invoice);
    }

    @Override
    public List<Invoice> getAllInvoices(){
        return repo.findAll();
    }

    @Override
    public Invoice getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void deleteInvoice(Long id) {
        boolean exists = repo.existsById(id);
        if (!exists) {
            throw new IllegalStateException("invoice number" + id + "does not exist");
        }
        repo.deleteById(id);
    }

}
