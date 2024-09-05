import ru.netology.stats.StatsService;


public class Main {

    public static void main(String[] args) {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println(service.sumOfAllSales(sales));
        System.out.println(service.averageAmountAllSales(sales));
        System.out.println(service.monthOfMaximumSales(sales));
        System.out.println(service.monthOfMinimumSales(sales));
        System.out.println(service.numberOfMonthsOfSaleIsBelowAverage(sales));
        System.out.println(service.numberOfMonthsOfSaleIsAboveAverage(sales));
    }


}
