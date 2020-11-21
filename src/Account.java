/*
(The Account class) Design a class named Account that contains:
■■ A private int data field named id for the account (default 0).
■■ A private double data field named balance for the account (default 0).
■ A private double data field named annualInterestRate that stores the current interest rate (default 0). Assume that all accounts have the same interest rate.
■■ A private Date data field named dateCreated that stores the date when the
account was created.
■■ A no-arg constructor that creates a default account.
■■ A constructor that creates an account with the specified id and initial balance.
■■ The accessor and mutator methods for id, balance, and annualInterestRate.
■■ The accessor method for dateCreated.
■■ A method named getMonthlyInterestRate() that returns the monthly
interest rate.
■■ A method named getMonthlyInterest() that returns the monthly interest.
■■ A method named withdraw that withdraws a specified amount from the
account.
■■ A method named deposit that deposits a specified amount to the account.
Draw the UML diagram for the class then implement the class. (Hint: The method
getMonthlyInterest() is to return monthly interest, not the interest rate.
Monthly interest is balance * monthlyInterestRate. monthlyInterestRate is annualInterestRate / 12. Note annualInterestRate is a percentage, for example 4.5%. You need to divide it by 100.)
Write a test program that creates an Account object with an account ID of 1122, a
balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw method
to withdraw $2,500, use the deposit method to deposit $3,000, and print the balance, the monthly interest, and the date when this account was created.
 */

import java.util.Date;

public class Account {
   //Data fields
    private int id;
    private double balance;
    private double annualInterest;
    private Date dataCreated;

    public Account() {
        id = 0;
        balance = 0;
        annualInterest = 0;
        dataCreated = new Date();

    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dataCreated = dataCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterest() {
        return annualInterest;
    }

    public void setAnnualInterest(double annualInterest) {
        this.annualInterest = annualInterest;
    }

    public Date getDataCreated() {
        return dataCreated;
    }

    public double getMonthlyInterestRate(){

        return annualInterest/12;
    }

    public double getMonthlyInterest(){

        return balance * (getMonthlyInterestRate() / 100);
    }
    public void withdraw(double amount){

        balance -= amount;
    }
    public void deposit(double amount){

        balance += amount;
    }

    public static void main(String[] args) {

        Account account = new Account(1122, 20000);

        //Set annual interest rate of 4.5%
        account.setAnnualInterest(4.5);

        //Withdraw 2.500
        account.withdraw(2500);

        //Deposit 3.000
        account.deposit(3000);

       //print the balance, the monthly interest, and the date when this account was created

        System.out.println(" Account Statement  ");
        System.out.println(" ----------------------------");
        System.out.println(" Account ID: " + account.getId());
        System.out.println(" Date created " + account.getDataCreated());
        System.out.println(" Balance " + account.getBalance());
        System.out.println(" Monthly interest" + account.getMonthlyInterest());

    }
}
