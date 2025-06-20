package week_1.Algorithms_DataStructures.FinancialForecasting;


public class RevenueData {
    private String month;
    private int amount;

    public RevenueData(String month, int amount) {
        this.month = month;
        this.amount = amount;
    }

    public String getMonth() {
        return month;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return month + ": ₹" + amount;
    }
}
