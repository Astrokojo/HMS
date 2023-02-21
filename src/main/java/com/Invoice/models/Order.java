package com.Invoice.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity @Getter @Setter
public class Order extends CommercialDocument{
    @ManyToOne
    Invoice invoice;
}
