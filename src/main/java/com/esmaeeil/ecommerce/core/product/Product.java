package com.esmaeeil.ecommerce.core.product;

import com.esmaeeil.ecommerce.core.category.Category;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;

    @Column
    private String summary;

    @Column
    private String description;

    @Column
    private BigDecimal price;


    @Column(name = "fk_category_id")
    private Long categoryId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_category_id", insertable = false, updatable = false)
    private Category category;

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSummary() {
        return this.summary;
    }

    public String getDescription() {
        return this.description;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
