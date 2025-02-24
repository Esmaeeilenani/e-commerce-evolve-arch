package com.esmaeeil.ecommerce.core.cart;

import com.esmaeeil.ecommerce.core.cart.dto.CartDto;
import com.esmaeeil.ecommerce.core.cartitem.CartItemDataMapper;

public class CartDataMapper {

    public static CartDto toDto(Cart cart) {
        if (cart == null) {
            return null;
        }

        CartDto cartDto = new CartDto();
        cartDto.setId(cart.getId());
        cartDto.setUsername(cart.getUsername());
        cartDto.setTotalPrice(cart.getTotalPrice());
        cartDto.setCartItems(CartItemDataMapper.toDto(cart.getCartItems()));
        return cartDto;
    }


}
