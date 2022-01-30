package com.colutti.designpatterns.chainOfResponsability.service.impl;

import com.colutti.designpatterns.chainOfResponsability.dto.Budget;
import com.colutti.designpatterns.chainOfResponsability.service.ADiscount;
import com.colutti.designpatterns.chainOfResponsability.service.Calculator;
import com.colutti.designpatterns.chainOfResponsability.service.exte.DiscountForBudgetWithMoreOfFiveItems;
import com.colutti.designpatterns.chainOfResponsability.service.exte.DiscountForBudgetWithValueLargerWhichFiveHundred;
import com.colutti.designpatterns.chainOfResponsability.service.exte.WithoutDiscount;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalculatorImpl implements Calculator {
    @Override
    public BigDecimal calculateDiscount(Budget budget) {
        ADiscount discount = new DiscountForBudgetWithValueLargerWhichFiveHundred(
                new DiscountForBudgetWithMoreOfFiveItems(
                        new WithoutDiscount()
                )
        );
        return discount.calculate(budget);
    }
}
