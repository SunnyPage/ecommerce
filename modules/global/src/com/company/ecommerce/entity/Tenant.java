package com.company.ecommerce.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "ECOMMERCE_TENANT")
@Entity(name = "ecommerce_Tenant")
public class Tenant extends StandardEntity {
    private static final long serialVersionUID = 8315844473007413835L;

    @Column(name = "NAMA", nullable = false)
    protected String nama;

    @Column(name = "CODE", nullable = false)
    protected String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}