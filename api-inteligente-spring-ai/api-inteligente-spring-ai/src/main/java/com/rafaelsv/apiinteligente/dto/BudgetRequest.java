package com.rafaelsv.apiinteligente.dto;

import java.math.BigDecimal;

public record BudgetRequest(
        String customerName,
        String serviceDescription,
        BigDecimal estimatedValue
) {}
