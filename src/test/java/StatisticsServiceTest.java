package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxZero() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-2, -4, 0, -4, -5, 0, -8, -6, 0, -1, -202};
        long expected = 0;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }}