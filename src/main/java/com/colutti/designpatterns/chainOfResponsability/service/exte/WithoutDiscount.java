package com.colutti.designpatterns.chainOfResponsability.service.exte;

import com.colutti.designpatterns.chainOfResponsability.dto.Budget;
import com.colutti.designpatterns.chainOfResponsability.service.ADiscount;
import java.math.BigDecimal;

public class WithoutDiscount extends ADiscount {

    public WithoutDiscount() {
        super(null);
    }

    @Override
    public BigDecimal calculate(Budget budget) {
        return BigDecimal.ZERO;
    }
}
