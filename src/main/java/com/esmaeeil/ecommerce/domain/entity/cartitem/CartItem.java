package com.esmaeeil.ecommerce.domain.entity.cartitem;

import com.esmaeeil.ecommerce.domain.entity.DomainEntity;
import com.esmaeeil.ecommerce.domain.entity.product.Product;
import com.esmaeeil.ecommerce.domain.valueobject.Money;

import java.math.BigDecimal;


public class CartItem extends DomainEntity<Long> {


    private Integer quantity;


    private String color;


    private Money unitPrice;

    private Money totalPrice;


    private Long productId;

    private Product product;





    public void increaseQuantity(){
        this.quantity++;
    }


    public void updateTotalPrice() {
        this.totalPrice = this.unitPrice.multiply(BigDecimal.valueOf(quantity));
    }
}



