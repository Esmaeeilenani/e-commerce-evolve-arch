package com.esmaeeil.ecommerce.core.cart;

import com.esmaeeil.ecommerce.core.cart.dto.CartDto;
import com.esmaeeil.ecommerce.core.cart.vm.AddCartItemVM;
import com.esmaeeil.ecommerce.core.cartitem.CartItem;
import com.esmaeeil.ecommerce.core.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@RequiredArgsConstructor
public class CartService {

    private final CartRepository cartRepository;
    private final ProductService productService;


    public CartDto getDtoByUsername(String username) {
        Cart cart = getByUsername(username);
        return CartDataMapper.toDto(cart);

    }

    public Cart getByUsername(String username) {
        return cartRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("cart not found!!!"));


    }


    public void addCartItem(String username, AddCartItemVM addCartItemVM) {
        Cart cart = getByUsername(username);

        CartItem cartItem = new CartItem();
        cartItem.setCartId(cartItem.getCartId());
        cartItem.setProductId(addCartItemVM.productId());
        cartItem.setQuantity(addCartItemVM.quantity());
        cartItem.setColor(addCartItemVM.color());
        cartItem.setPrice(productService.getProductPriceById(addCartItemVM.productId()));

        cart.addItem(cartItem);

        cartRepository.save(cart);

    }
}
