package com.esmaeeil.ecommerce.domain.entity.product;

import com.esmaeeil.ecommerce.core.category.Category;
import com.esmaeeil.ecommerce.domain.entity.DomainEntity;
import com.esmaeeil.ecommerce.domain.valueobject.Money;


public class Product extends DomainEntity<Long> {

    private String name;

    private String summary;

    private String description;

    private Money price;
    private int unitsInStock;

    private boolean isAvailable;

    private Category category;

    public Product(String name, String summary, String description, Money price, int unitsInStock, boolean isAvailable) {
        this.name = name;
        this.summary = summary;
        this.description = description;
        this.price = price;
        this.unitsInStock = unitsInStock;
        this.isAvailable = isAvailable;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
