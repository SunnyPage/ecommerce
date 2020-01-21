package com.company.ecommerce.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "ECOMMERCE_CUSTOMER")
@Entity(name = "ecommerce_Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = 2663860954128574642L;
}