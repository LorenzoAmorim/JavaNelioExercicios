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

        for(int i = 1; i<months; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);
        }
    }
}
