package Interfaces.src.application;

import Interfaces.src.entities.Contract;
import Interfaces.src.entities.Installments;
import Interfaces.src.services.ContractService;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");

        System.out.print("Número: ");
        int numero = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.next(), df);
        System.out.print("Valor do contrato: ");
        double valor = sc.nextDouble();

        Contract contract = new Contract(numero, data, valor);

        System.out.print("Entre com o número de parcelas: ");
        int parcelas = sc.nextInt();

        ContractService contractService = new ContractService(null);

        contractService.processContract(contract, parcelas);

        System.out.println("Parcelas: ");
        for(Installments installments : contract.getInstallments()){
            System.out.println(installments);
        }



        sc.close();
    }
}
