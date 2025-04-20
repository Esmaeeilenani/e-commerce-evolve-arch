package com.esmaeeil.ecommerce.domain.entity;

public abstract class DomainEntity <ID> {

    private ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}
