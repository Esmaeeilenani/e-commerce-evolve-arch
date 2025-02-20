package com.esmaeeil.ecommerce.core.cartitem;

import com.esmaeeil.ecommerce.core.cart.Cart;
import com.esmaeeil.ecommerce.core.product.Product;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "cart_item")
@Setter
@Getter
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer quantity;

    @Column
    private String color;

    @Column
    private BigDecimal price;

    @Column(name = "fk_product_id")
    private Long productId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_product_id",insertable = false, updatable = false)
    private Product product;

    @Column(name = "fk_cart_id")
    private Long cartId;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_cart_id",insertable = false, updatable = false)
    private Cart cart;


}
