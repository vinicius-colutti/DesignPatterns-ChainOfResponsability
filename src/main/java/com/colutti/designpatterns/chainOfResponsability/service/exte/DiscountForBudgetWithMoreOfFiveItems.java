package com.colutti.designpatterns.chainOfResponsability.service.exte;

import com.colutti.designpatterns.chainOfResponsability.dto.Budget;
import com.colutti.designpatterns.chainOfResponsability.service.ADiscount;

import java.math.BigDecimal;

public class DiscountForBudgetWithMoreOfFiveItems extends ADiscount {

    public DiscountForBudgetWithMoreOfFiveItems(ADiscount next) {
        super(next);
    }

    @Override
    public BigDecimal calculate(Budget budget) {
        if (budget.getQuantityItems() > 5) {
            return budget.getValue().multiply(new BigDecimal("0.1"));
        }

        return next.calculate(budget);
    }
}
