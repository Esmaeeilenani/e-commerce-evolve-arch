package com.esmaeeil.ecommerce.core.cart;

import com.esmaeeil.ecommerce.core.cart.dto.CartDto;
import com.esmaeeil.ecommerce.core.cart.vm.AddCartItemVM;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("v1/api/carts")
class CartController {

    private final CartService cartService;

    @GetMapping("by-username/{username}")
    public ResponseEntity<CartDto> getCartByUsername(@PathVariable String username) {

        return ResponseEntity.ok(cartService.getDtoByUsername(username));

    }

    @PostMapping("{username}/add-item")
    public ResponseEntity<Void> addItemToCart(@PathVariable String username, @RequestBody AddCartItemVM addCartItemVM){

        cartService.addCartItem(username,addCartItemVM);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}
