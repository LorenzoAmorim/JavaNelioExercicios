package Interfaces.src.services;

// Tipo de serviço de contrato
public class PaypalService implements OnlinePaymentService {

    // fee= taxas
    public Double paymentFee(Double amount) {
        double PercentFee = amount * 0.02;
        return PercentFee;
    }

    // interest=juros
    public Double interest(Double amount, Integer months) {
        double PercentInterest = amount * 0.01;
        return PercentInterest * months;
    }
}
