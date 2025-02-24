package com.esmaeeil.ecommerce.core.cart.dto;

import com.esmaeeil.ecommerce.core.cartitem.dto.CartItemDto;

import java.util.List;

public class CartDto {

    private Long id;

    private String username;

    private double totalPrice;

    private List<CartItemDto> cartItems;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<CartItemDto> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItemDto> cartItems) {
        this.cartItems = cartItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
