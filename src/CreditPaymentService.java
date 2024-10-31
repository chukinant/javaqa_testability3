public class CreditPaymentService {
    public double calculate(int creditAmount, int years, double yearlyInterestRate) {
        double monthlyInterestRate = yearlyInterestRate / 12 / 100;
        double result = creditAmount * (monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -years * 12)));
        return result;
    }
}
