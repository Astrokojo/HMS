package com.Invoice.repo;

import com.Invoice.models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepo extends JpaRepository <Invoice, Long> {
}
