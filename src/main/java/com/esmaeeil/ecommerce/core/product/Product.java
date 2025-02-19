package com.esmaeeil.ecommerce.core.product;

import com.esmaeeil.ecommerce.core.category.Category;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Setter
@Getter
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

}
