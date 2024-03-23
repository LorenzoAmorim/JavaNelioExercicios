package ClassesEMetodosAbstratos.src.application;

import ClassesEMetodosAbstratos.src.application.entities.PF;
import ClassesEMetodosAbstratos.src.application.entities.PJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<PF> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i = 1; i<= n; i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if(type == 'i'){
                System.out.print("Health expenditures: ");
                double healthSpend = sc.nextDouble();
                list.add(new PF(name, anualIncome, healthSpend));
            }if (type == 'c'){
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                list.add(new PJ(name, anualIncome, employees));
            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for(PF persons : list){
            System.out.println(persons.toString());
            double tax = persons.Tax();
            sum += tax;
        }

        System.out.printf("\nTOTAL TAXES: " + String.format("%.2f", sum));


        sc.close();
    }
}
