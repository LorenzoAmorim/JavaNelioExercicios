package Interfaces.src.services;

// contrato do serviço
public interface OnlinePaymentService {
    Double paymentFee(Double amount);
    Double interest(Double amount, Integer months);
}
