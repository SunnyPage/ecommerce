package com.company.ecommerce.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.List;

@NamePattern("%s|street")
@Table(name = "ECOMMERCE_ADDRESS")
@Entity(name = "ecommerce_Address")
public class Address extends StandardEntity {

    @Column(name = "STREET", nullable = false)
    protected String street;

    @Column(name = "POST_CODE", nullable = false)
    protected String postCode;

    @Column(name = "CITY", nullable = false)
    protected String city;


    private static final long serialVersionUID = -2910784475161739455L;
    @OneToMany(mappedBy = "address")
    protected List<Order> lineItem;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNT_ID")
    protected Account account;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CUSTOMER_ID")
    protected Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }


    public List<Order> getLineItem() {
        return lineItem;
    }

    public void setLineItem(List<Order> lineItem) {
        this.lineItem = lineItem;
    }
}