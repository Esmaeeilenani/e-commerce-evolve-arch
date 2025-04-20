package com.esmaeeil.ecommerce.domain.valueobject;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Money {
    private final BigDecimal amount;

    public static final Money ZERO = new Money(BigDecimal.ZERO);

    public Money(BigDecimal amount) {
        this.amount = setScale(amount);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public boolean isGreaterThanZero() {
        return this.amount != null && this.amount.compareTo(BigDecimal.ZERO) > 0;
    }

    public boolean isGreaterThan(Money money) {
        return this.amount != null && this.amount.compareTo(money.amount) > 0;
    }

    public Money add(Money money) {
        return new Money(setScale(this.amount.add(money.amount)));
    }

    public Money multiply(BigDecimal amount) {
        return new Money(setScale(this.amount.multiply(amount)));
    }

    private BigDecimal setScale(BigDecimal input) {
        return input.setScale(2, RoundingMode.HALF_EVEN);
    }

}
