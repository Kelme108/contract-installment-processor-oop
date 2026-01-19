package application;

import entities.Contract;
import entities.Installment;
import service.ContractService;
import service.OnlinePaymentService;
import service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato:");
        System.out.print("Numero: ");
        Integer number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate contractDate = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        Double totalValue = sc.nextDouble();

        Contract obj = new Contract(number, contractDate, totalValue);
        System.out.println("Entre com o número de parcelas");
        Integer n = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(obj, n);

        for (Installment installment : obj.getInstalments()){
            System.out.println(installment);
        }

        sc.close();
    }
}
