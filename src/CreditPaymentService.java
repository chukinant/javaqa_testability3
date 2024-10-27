public class CreditPaymentService {
    public double calculate(int creditSum, int years, double yearlyInterestRate) {
        double monthlyInterestRate = yearlyInterestRate/12/100;
        double result = creditSum*(monthlyInterestRate/(1-Math.pow(1+monthlyInterestRate,-years*12)));
        return result;
    }
}
