package week_1.Algorithms_DataStructures.FinancialForecasting;


import java.util.*;

public class ForecastDemo {

    public static void main(String[] args) {
        List<RevenueData> revenues = new ArrayList<>();
        revenues.add(new RevenueData("January", 50000));
        revenues.add(new RevenueData("February", 60000));
        revenues.add(new RevenueData("March", 70000));
        revenues.add(new RevenueData("April", 55000));
        revenues.add(new RevenueData("May", 80000));
        revenues.add(new RevenueData("June", 65000));

        ForecastService service = new ForecastService();

        System.out.println("📊 Financial Forecast Summary:");
        System.out.println("------------------------------");

        int total = service.calculateTotal(revenues);
        double average = service.calculateAverage(revenues);
        RevenueData max = service.getMaxMonth(revenues);
        RevenueData min = service.getMinMonth(revenues);
        String trend = service.detectTrend(revenues);

        System.out.println("Total Revenue: ₹" + total);
        System.out.println("Average Monthly Revenue: ₹" + String.format("%.2f", average));
        System.out.println("Highest Revenue: " + max);
        System.out.println("Lowest Revenue: " + min);
        System.out.println("Trend Analysis: " + trend);
    }
}

