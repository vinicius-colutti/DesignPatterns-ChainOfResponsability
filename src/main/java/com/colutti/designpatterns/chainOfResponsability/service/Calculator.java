package com.colutti.designpatterns.chainOfResponsability.service;

import com.colutti.designpatterns.chainOfResponsability.dto.Budget;

import java.math.BigDecimal;

public interface Calculator {

    BigDecimal calculateDiscount(Budget budget);

}
