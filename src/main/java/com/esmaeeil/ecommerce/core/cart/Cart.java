package com.esmaeeil.ecommerce.core.cart;

import com.esmaeeil.ecommerce.core.cartitem.CartItem;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@Entity
@Setter
@Getter
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

}
