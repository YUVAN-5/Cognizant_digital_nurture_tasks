package week_1.Algorithms_DataStructures.FinancialForecasting;

import java.util.*;

public class ForecastService {

    public int calculateTotal(List<RevenueData> data) {
        int total = 0;
        for (RevenueData rd : data) {
            total += rd.getAmount();
        }
        return total;
    }

    public double calculateAverage(List<RevenueData> data) {
        if (data.isEmpty()) return 0;
        return calculateTotal(data) / (double) data.size();
    }

    public RevenueData getMaxMonth(List<RevenueData> data) {
        return Collections.max(data, Comparator.comparingInt(RevenueData::getAmount));
    }

    public RevenueData getMinMonth(List<RevenueData> data) {
        return Collections.min(data, Comparator.comparingInt(RevenueData::getAmount));
    }

    public String detectTrend(List<RevenueData> data) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < data.size(); i++) {
            if (data.get(i).getAmount() > data.get(i - 1).getAmount()) {
                decreasing = false;
            } else if (data.get(i).getAmount() < data.get(i - 1).getAmount()) {
                increasing = false;
            } else {
                increasing = decreasing = false;
            }
        }

        if (increasing) return "📈 Increasing Trend";
        if (decreasing) return "📉 Decreasing Trend";
        return "🔄 Mixed Trend";
    }
}

