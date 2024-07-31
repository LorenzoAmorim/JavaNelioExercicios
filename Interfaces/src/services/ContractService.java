package Interfaces.src.services;

import Interfaces.src.entities.Contract;
import Interfaces.src.entities.Installments;

import java.time.LocalDate;

// serviço de contrato
public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract (Contract contract, int months){

        double basicQuota = contract.getTotalValue()/months;

        for(int i = 1; i<= months; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);

            // juros
            // basicQuota = 200
            // interest = 2
            // fee = 4.04
            double interest = onlinePaymentService.interest(basicQuota, i);
            // taxa
            double paymentFee = onlinePaymentService.paymentFee(basicQuota + interest);

            double totalValue = basicQuota + interest + paymentFee;
        }

//        contract.getInstallments().add(new Installments(LocalDate.of(2024, 7, 30), 206.04));
//        contract.getInstallments().add(new Installments(LocalDate.of(2024, 8, 30), 208.08));
    }
}
