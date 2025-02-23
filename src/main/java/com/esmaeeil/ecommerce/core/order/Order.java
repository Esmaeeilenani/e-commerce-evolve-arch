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

    public Long getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public BigDecimal getTotalPrice() {
        return this.totalPrice;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public String getAddressLine() {
        return this.addressLine;
    }

    public String getCountry() {
        return this.country;
    }

    public String getState() {
        return this.state;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public String getCardName() {
        return this.cardName;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getExpiration() {
        return this.expiration;
    }

    public String getCvv() {
        return this.cvv;
    }

    public PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    public enum PaymentMethod{
        CREDIT_CARD,DEBIT_CARD,PAYPAL
    }
}
