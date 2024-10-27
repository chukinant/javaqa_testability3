public class Main {
    public static void main(String[] args) {

        // new object of class CreditPaymentService
        CreditPaymentService monthlyPayment = new CreditPaymentService();

        // specifying variables
        double yearlyInterestRate = 9.99;
        int creditAmount = 1_000_000;
        int years = 1;

        // calling a method and printing the calculation result
        double payment = monthlyPayment.calculate(creditAmount, years, yearlyInterestRate);
        System.out.println();
        System.out.println("Calculated monthly payment: " + (int) payment + " roubles");
    }
}