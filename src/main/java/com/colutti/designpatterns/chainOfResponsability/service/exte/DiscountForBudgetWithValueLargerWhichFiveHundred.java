package com.colutti.designpatterns.chainOfResponsability.service.exte;

import com.colutti.designpatterns.chainOfResponsability.dto.Budget;
import com.colutti.designpatterns.chainOfResponsability.service.ADiscount;
import java.math.BigDecimal;

public class DiscountForBudgetWithValueLargerWhichFiveHundred extends ADiscount {

    public DiscountForBudgetWithValueLargerWhichFiveHundred(ADiscount next) {
        super(next);
    }

    @Override
    public BigDecimal calculate(Budget budget) {
        if (budget.getValue().compareTo(new BigDecimal("500")) > 0) {
            return budget.getValue().multiply(new BigDecimal("0.05"));
        }

        return next.calculate(budget);
    }
}
