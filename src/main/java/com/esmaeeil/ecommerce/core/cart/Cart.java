package com.esmaeeil.ecommerce.core.cart;

import com.esmaeeil.ecommerce.core.cartitem.CartItem;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String username;

    @OneToMany(mappedBy = "cart", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<CartItem> cartItems;

    public double getTotalPrice() {

        if (cartItems == null) {
            return new BigDecimal(0).doubleValue();
        }

        double sum = this.cartItems
                .stream()
                .mapToDouble(i -> i.getPrice().multiply(new BigDecimal(i.getQuantity())).doubleValue())
                .sum();
        return new BigDecimal(sum).setScale(2, RoundingMode.HALF_EVEN).doubleValue();

    }

    public Long getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public List<CartItem> getCartItems() {
        return this.cartItems;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public void addItem(CartItem cartItem) {
        if (this.cartItems == null) {
            this.cartItems = new ArrayList<>(0);
        }
        cartItem.setCartId(this.id);
        this.cartItems.add(cartItem);
    }
}
