public class FinancialForecasting {
    public static void main(String[] args) {
        double initialValue = 1000; // Initial investment
        double growthRate = 0.05;   // 5% annual growth
        int years = 10;

        double futureValue = calculateFutureValue(initialValue, growthRate, years);
        System.out.printf("Future value after %d years: %.2f%n", years, futureValue);

        // Optimized version using memoization
        double[] memo = new double[years + 1];
        double futureValueMemo = calculateFutureValueMemo(initialValue, growthRate, years, memo);
        System.out.printf("Future value with memoization after %d years: %.2f%n", years, futureValueMemo);
    }

    // Recursive approach
    public static double calculateFutureValue(double value, double rate, int years) {
        if (years == 0) return value;
        return calculateFutureValue(value, rate, years - 1) * (1 + rate);
    }

    // Optimized recursive approach with memoization
    public static double calculateFutureValueMemo(double value, double rate, int years, double[] memo) {
        if (years == 0) return value;
        if (memo[years] != 0) return memo[years];
        memo[years] = calculateFutureValueMemo(value, rate, years - 1, memo) * (1 + rate);
        return memo[years];
    }
}
