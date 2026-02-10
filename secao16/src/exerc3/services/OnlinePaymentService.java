package secao16.src.exerc3.services;

public interface OnlinePaymentService {
    double paymentFee(double amount);
    double interest(double amount, int months);
}
