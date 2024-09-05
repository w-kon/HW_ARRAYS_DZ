package ru.netology.stats;


public class StatsService {

    public long sumOfAllSales(long[] sales) {
        long sum = 0;

        for (long sale : sales) {
            sum += sale;
        }

        return sum;
    }

    public long averageAmountAllSales(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) sum += sales[i];

        return sum / sales.length;
    }

    public int monthOfMaximumSales(long[] sales) {
        int monthSales = 0;

        for (int i = 0; i < sales.length; i++) {
            monthSales = (sales[i] >= sales[monthSales]) ? i : monthSales;
        }
        return monthSales + 1;
    }

    public int monthOfMinimumSales(long[] sales) {
        int monthSales = 0;

        for (int i = 0; i < sales.length; i++) {
            monthSales = (sales[i] <= sales[monthSales]) ? i : monthSales;
        }
        return monthSales + 1;
    }

    public int numberOfMonthsOfSaleIsBelowAverage(long[] sales) {
        int nam = 0;

        for (Long sale : sales) {
            nam += (sale < averageAmountAllSales(sales) ? 1 : 0);
        }
        return nam;
    }

    public int numberOfMonthsOfSaleIsAboveAverage(long[] sales) {
        int nam = 0;

        for (Long sale : sales) {
            nam += (sale > averageAmountAllSales(sales) ? 1 : 0);
        }
        return nam;
    }

}

