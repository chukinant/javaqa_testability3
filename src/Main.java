public class Main {
    public static void main(String[] args) {
        CreditPaymentService monthlyPayment = new CreditPaymentService();
        double yearlyInterestRate = 9.99;
        int creditSum = 1_000_000;
        int years = 1;
        double payment = monthlyPayment.calculate(creditSum, years, yearlyInterestRate);
        System.out.println();
        System.out.println("Calculated monthly payment: " + (int) payment + " roubles");
    }
}