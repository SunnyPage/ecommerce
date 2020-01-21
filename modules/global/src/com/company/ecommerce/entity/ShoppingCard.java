package com.company.ecommerce.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "ECOMMERCE_SHOPPING_CARD")
@Entity(name = "ecommerce_ShoppingCard")
public class ShoppingCard extends StandardEntity {
    private static final long serialVersionUID = 9198132941970127581L;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED", nullable = false)
    protected Date created;

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}