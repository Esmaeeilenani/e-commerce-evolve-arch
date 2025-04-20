package com.esmaeeil.ecommerce.domain.entity.order;

public class BillingAddress {

    private final String firstName;
    private final String lastName;
    private final String emailAddress;
    private final String addressLine;
    private final String country;
    private final String state;

    private final String zipCode;


    public BillingAddress(String firstName, String lastName, String emailAddress, String addressLine, String country, String state, String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.addressLine = addressLine;
        this.country = country;
        this.state = state;
        this.zipCode = zipCode;
    }
}
