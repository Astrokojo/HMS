package com.Invoice.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass @Getter @Setter
public class SystemIdentity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String oid;
}
