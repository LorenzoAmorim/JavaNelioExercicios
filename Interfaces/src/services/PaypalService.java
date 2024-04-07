package Interfaces.src.services;

// Tipo de serviço de contrato
public class PaypalService implements OnlinePaymentService {

    // taxa de pagamento
    public Double paymentFee(Double amount) {
//        double PercentFee = 0.0;
//        PercentFee = interest()
        return null;
    }

    // interest=juros
    public Double interest(Double amount, Integer months) {
        double PercentInterest = 0.0;
        PercentInterest = amount * 0.01;
        return amount + PercentInterest * months;
    }
}
