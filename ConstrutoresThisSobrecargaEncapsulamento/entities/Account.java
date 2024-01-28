package ConstrutoresThisSobrecargaEncapsulamento.entities;

public class Account {
    private int AccountNumber; // talvez não use
    private String holder; // talvez não use
    private double balance;

    public Account(int accountNumber, String holder) {
        AccountNumber = accountNumber;
        this.holder = holder;
    }

    public Account(int accountNumber, String holder, double initialDeposit) {
        AccountNumber = accountNumber;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount){
        double tax = 5.00;
        balance -= amount + tax;
    }

    public String toString(){
        return "Account "
                + AccountNumber
                + ", Holder: "
                + holder
                + ", Balance: $"
                + balance;
    }
}