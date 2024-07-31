package Interfaces.src.services;

// Tipo de serviço de contrato
public class PaypalService implements OnlinePaymentService {

    @Override
    // fee= taxas
    public Double paymentFee(Double amount) {
        return amount * 0.02;
    }

    @Override
    // interest=juros
    public Double interest(Double amount, Integer months) {
        double PercentInterest = amount * 0.01;
        return PercentInterest * months;
    }
}
