package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    @Test
    void testSumOfAllSales() {
        StatsService service = new StatsService();
        long expected = 180;
        long actual = service.sumOfAllSales(sales);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void testAverageAmountAllSales() {
        StatsService service = new StatsService();
        long expected = 15;
        long actual = service.averageAmountAllSales(sales);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void testMonthOfMaximumSales() {
        StatsService service = new StatsService();
        long expected = 8;
        long actual = service.monthOfMaximumSales(sales);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void testMonthOfMinimumSales() {
        StatsService service = new StatsService();
        long expected = 9;
        long actual = service.monthOfMinimumSales(sales);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void testNumberOfMonthsOfSaleIsBelowAverage() {
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.numberOfMonthsOfSaleIsBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void testNumberOfMonthsOfSaleIsAboveAverage() {
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.numberOfMonthsOfSaleIsAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

}

