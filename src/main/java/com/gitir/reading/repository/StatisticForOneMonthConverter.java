package com.gitir.reading.repository;

import java.math.BigDecimal;

public interface StatisticForOneMonthConverter {
    String getMonth();

    Long getTotalOrderCount();

    Long getTotalBookCount();

    BigDecimal getTotalPurchasedAmount();
}
