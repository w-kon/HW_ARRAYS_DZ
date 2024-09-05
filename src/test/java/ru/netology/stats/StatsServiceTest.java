package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.stats.StatsService;

import java.lang.reflect.Array;


public class StatsServiceTest {
    @ParameterizedTest
//    @CsvFileSource(files = "src/test/resources/DataTest.txt")
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    @Test

    void testSumOfAllSales(long[] sales) {
        StatsService service = new StatsService();



        // подготавливаем данные:
        long expected = 180;

        // вызываем целевой метод:
        long actual = service.sumOfAllSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    void testSumOfAllSales(long[] sales) {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // подготавливаем данные:
        long expected = 180;

        // вызываем целевой метод:
        long actual = service.sumOfAllSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSumOfAllSales(long[] sales) {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // подготавливаем данные:
        long expected = 180;

        // вызываем целевой метод:
        long actual = service.sumOfAllSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSumOfAllSales(long[] sales) {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // подготавливаем данные:
        long expected = 180;

        // вызываем целевой метод:
        long actual = service.sumOfAllSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}

