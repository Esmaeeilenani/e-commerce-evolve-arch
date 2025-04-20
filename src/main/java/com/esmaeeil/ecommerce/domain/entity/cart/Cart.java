package com.esmaeeil.ecommerce.domain.entity.cart;

import com.esmaeeil.ecommerce.domain.entity.DomainEntity;
import com.esmaeeil.ecommerce.domain.entity.cartitem.CartItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Cart extends DomainEntity<Long> {

    private String username;

    private List<CartItem> cartItems;


    public Cart(String username) {
        this.username = username;
        this.cartItems = new ArrayList<>(0);
    }



    public void addItem(CartItem newItem){
        CartItem existedItem = findItem(newItem.getId())
                .orElse(null);

        if (existedItem == null) {
            this.cartItems.add(newItem);
            return;
        }
        existedItem.increaseQuantity();
        existedItem.updateTotalPrice();



    }


    public void removeItem(Long itemId){
        findItem(itemId).ifPresent(item -> this.cartItems.remove(item));
    }

    public Optional<CartItem> findItem(Long itemId){

        return this.cartItems
                .stream()
                .filter(item -> item.getId().equals(itemId))
                .findFirst();


    }
}
