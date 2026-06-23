public class FinancialForecast {

    public static double forecast(double amount, double growthRate, int years) {

        // Base case
        if (years == 0) {
            return amount;
        }

        return forecast(amount * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {

        double currentAmount = 10000;   // Initial amount
        double growthRate = 0.10;       // 10% growth rate
        int years = 5;

        double futureAmount = forecast(currentAmount, growthRate, years);

        System.out.println("Current Amount: ₹" + currentAmount);
        System.out.println("Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Years: " + years);
        System.out.println("Predicted Future Amount: ₹" + futureAmount);
    }
}