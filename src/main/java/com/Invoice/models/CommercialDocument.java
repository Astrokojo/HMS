package com.Invoice.models;

import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@Entity
abstract public class CommercialDocument extends SystemIdentity{

    LocalDate date;
    Integer number;

    @ManyToOne
    Customer customer;
    @ElementCollection
    Collection<Detail> details;

    String remark;



    public CommercialDocument( Integer number, Collection<Detail> details) {

        this.number = number;
        this.details = details;
    }

    public CommercialDocument() {
        super();
    }




    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Collection<Detail> getDetails() {
        return details;
    }

    public void setDetails(Collection<Detail> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "CommercialDocument{" +
                ", date=" + date +
                ", number=" + number +
                ", details=" + details +
                '}';
    }

}
