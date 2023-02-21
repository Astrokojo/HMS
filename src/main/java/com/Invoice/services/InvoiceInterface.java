package com.Invoice.services;

import com.Invoice.models.Invoice;

import java.util.List;

public interface InvoiceInterface {
    Invoice addInvoice(Invoice invoice);

    List<Invoice> getAllInvoices();

    Invoice getById(Long id);

    void deleteInvoice(Long id);
}
