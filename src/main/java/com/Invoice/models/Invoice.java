package com.Invoice.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.List;

@Entity @Getter @Setter
public class Invoice extends CommercialDocument{
    @OneToMany(mappedBy = "invoice")
    Collection<Order> orders;
}
