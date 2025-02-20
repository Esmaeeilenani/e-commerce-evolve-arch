package com.esmaeeil.ecommerce.core.order;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Setter
@Getter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String username;

    @Column(name = "total_price")
    private BigDecimal totalPrice;

    @Column(name = "first_name")
    public String firstName;
    @Column(name = "last_name")
    public String lastName;
    @Column(name = "email_address")
    public String emailAddress;
    @Column(name = "address_line")
    public String addressLine;
    @Column(name = "country")
    public String country;
    @Column
    public String state;
    @Column(name = "zip_code")
    public String zipCode;

    // Payment
    @Column(name = "card_name")
    public String cardName;
    @Column(name = "card_number")
    public String cardNumber;
    @Column
    public String expiration;
    @Column
    public String cvv;

    @Column(name = "payment_method")
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;


    public enum PaymentMethod{
        CREDIT_CARD,DEBIT_CARD,PAYPAL
    }
}
