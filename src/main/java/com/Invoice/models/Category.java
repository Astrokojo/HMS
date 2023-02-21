package com.Invoice.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity @Getter @Setter
public class Category extends SystemIdentity{

    String description;
}
