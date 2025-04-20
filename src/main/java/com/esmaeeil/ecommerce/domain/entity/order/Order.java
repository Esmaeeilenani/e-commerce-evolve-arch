package com.esmaeeil.ecommerce.domain.entity.order;

import com.esmaeeil.ecommerce.domain.entity.DomainEntity;

public class Order extends DomainEntity<Long> {

    private String username;
    private BillingAddress billingAddress;

    private OrderStatus orderStatus;

    private PaymentCard paymentCard;
    private PaymentMethod paymentMethod;


    public Order(String username, BillingAddress billingAddress, OrderStatus orderStatus, PaymentCard paymentCard, PaymentMethod paymentMethod) {
        this.username = username;
        this.billingAddress = billingAddress;
        this.orderStatus = orderStatus;
        this.paymentCard = paymentCard;
        this.paymentMethod = paymentMethod;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public PaymentCard getPaymentCard() {
        return paymentCard;
    }

    public void setPaymentCard(PaymentCard paymentCard) {
        this.paymentCard = paymentCard;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
