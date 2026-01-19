package service;

import entities.Contract;
import entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){

        Double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate finalDate = contract.getContractDate().plusMonths(i);
            Double interest = onlinePaymentService.interest(basicQuota, i);
            Double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            Double quota = basicQuota + interest + fee;

            contract.getInstalments().add(new Installment(finalDate, quota));
        }
    }
}
