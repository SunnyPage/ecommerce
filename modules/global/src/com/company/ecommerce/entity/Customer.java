package com.company.ecommerce.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import java.util.List;

@NamePattern("%s|user")
@Table(name = "ECOMMERCE_CUSTOMER")
@Entity(name = "ecommerce_Customer")
public class Customer extends StandardTenantEntity {
    private static final long serialVersionUID = 2663860954128574642L;

    @OneToMany(mappedBy = "customer")
    protected List<Address> address;

    @OneToMany(mappedBy = "customer")
    protected List<Phone> phone;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ACCOUNT_CUSTOMER_ID")
    protected Account accountCustomer;
    @Column(name = "EMAIL", nullable = false)
    protected String email;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID")
    protected User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Account getAccountCustomer() {
        return accountCustomer;
    }

    public void setAccountCustomer(Account accountCustomer) {
        this.accountCustomer = accountCustomer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Phone> getPhone() {
        return phone;
    }

    public void setPhone(List<Phone> phone) {
        this.phone = phone;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }
}