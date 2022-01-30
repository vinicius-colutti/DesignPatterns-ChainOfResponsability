package com.colutti.designpatterns.chainOfResponsability.dto;

import java.math.BigDecimal;

public class Budget {

    private BigDecimal value;
    private int quantityItems;

    public Budget(BigDecimal value, int quantityItems) {
        this.value = value;
        this.quantityItems = quantityItems;
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getQuantityItems() {
        return quantityItems;
    }
}
