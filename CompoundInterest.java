public class CompoundInterest {
    public static void main(String[] args) {
        // Given values
        double P = 5000.00;   // Principal amount in dollars
        double r = 0.04;      // Interest rate per year (4% = 0.04)
        int n = 10;           // Number of years

        // Apply the compound interest formula: A = P * (1 + r)^n
        double A = P * Math.pow(1 + r, n);

        // Calculate the interest earned
        double interest = A - P;

        // Display the results
        System.out.println("Compound Interest Calculator");
        System.out.println("Principal (P):   $" + P);
        System.out.println("Interest Rate:   " + (r * 100) + "% per year");
        System.out.println("Time Period:     " + n + " years");
        System.out.printf("Amount (A):      $%.2f%n", A);
        System.out.printf("Interest Earned: $%.2f%n", interest);
    }
}
