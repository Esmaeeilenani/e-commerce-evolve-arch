package com.esmaeeil.ecommerce.core.cartitem;

import com.esmaeeil.ecommerce.core.cartitem.dto.CartItemDto;
import com.esmaeeil.ecommerce.core.product.Product;

import java.util.List;

public class CartItemDataMapper {


    public static CartItemDto toDto(CartItem cartItem){
        if (cartItem == null) {
            return null;
        }

        CartItemDto cartItemDto = new CartItemDto();
        cartItemDto.setId(cartItem.getId());
        cartItemDto.setColor(cartItem.getColor());
        cartItemDto.setQuantity(cartItem.getQuantity());
        cartItemDto.setPrice(cartItem.getPrice());
        Product product = cartItem.getProduct();
        cartItemDto.setProductName(product.getName());
        cartItemDto.setCategoryName(product.getCategory().getName());

        return cartItemDto;

    }


    public static List<CartItemDto> toDto(List<CartItem> cartItems) {
        return cartItems.stream().map(CartItemDataMapper::toDto).toList();
    }
}
