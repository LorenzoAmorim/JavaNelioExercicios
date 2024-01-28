package ConstrutoresThisSobrecargaEncapsulamento.application;

import ConstrutoresThisSobrecargaEncapsulamento.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char yesOrNot = sc.nextLine().charAt(0);

        if(yesOrNot == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialValue = sc.nextDouble();
            account = new Account(accountNumber, holder, initialValue);
        }else {
            account = new Account(accountNumber, holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account.toString());
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);
        System.out.println("Updated account data: ");
        System.out.println(account.toString());

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.println(account.toString());
        sc.close();
    }
}
