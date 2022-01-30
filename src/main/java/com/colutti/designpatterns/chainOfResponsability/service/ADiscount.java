package com.colutti.designpatterns.chainOfResponsability.service;

import com.colutti.designpatterns.chainOfResponsability.dto.Budget;
import java.math.BigDecimal;

public abstract class ADiscount {

    protected ADiscount next;

    public ADiscount(ADiscount next) {
        this.next = next;
    }

    public abstract BigDecimal calculate(Budget budget);

}
