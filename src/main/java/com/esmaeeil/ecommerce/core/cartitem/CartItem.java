package com.esmaeeil.ecommerce.core.cartitem;

import com.esmaeeil.ecommerce.core.cart.Cart;
import com.esmaeeil.ecommerce.core.product.Product;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "cart_item")
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


    public Long getId() {
        return this.id;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public String getColor() {
        return this.color;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public Long getProductId() {
        return this.productId;
    }

    public Product getProduct() {
        return this.product;
    }

    public Long getCartId() {
        return this.cartId;
    }

    public Cart getCart() {
        return this.cart;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
