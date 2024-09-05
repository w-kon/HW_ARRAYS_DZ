import ru.netology.stats.StatsService;


public class Main {

    public static void main(String[] args) {

        StatsService servces = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println(servces.sumOfAllSales(sales));
        System.out.println(servces.averageAmountAllSales(sales));
        System.out.println(servces.monthOfMaximumSales(sales));
        System.out.println(servces.monthOfMinimumSales(sales));
        System.out.println(servces.numberOfMonthsOfSaleIsBelowAverage(sales));
        System.out.println(servces.numberOfMonthsOfSaleIsAboveAverage(sales));
    }


}
