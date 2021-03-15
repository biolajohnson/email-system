package com.bankApplications.reduxBank;

import java.util.Random;
import java.util.Scanner;

public class Account extends Person{

    int accountNumber;
    double balance;



    public Account(){}

    public Account(String names){
        super.splitNames(names);
        createAccount();
}
    public void takeLoans() throws InterruptedException {
        //print loan options
        System.out.println("Hello! we have 3 loan options available.");
        System.out.println("1. House loans(Mortgage) \n2. Car Loans \n3. School loans\n Please press the respective key");
        //match loan with keys
        Scanner scanner = new Scanner(System.in);
        String loanOption = scanner.nextLine();

        switch (loanOption){
            case "1":
                //prompt for the option we picked
                System.out.println("You have picked the House loan option\n How much is your dream house? ");
                scanner = new Scanner(System.in);
                double housePrice = Double.parseDouble(scanner.nextLine());

                if (housePrice > 100000000){
                    System.out.println("Sorry we do not have that type of money. Your dream house is too expensive!");
                } else {
                    //process with the bank
                    double interestedMonies =  housePrice * 1.5;
                    //sleep with message for 2 sec..
                    System.out.println("Processing...");
                    Thread.sleep(4000);
                    String output = String.format("We will deduct N%.2f from your account every month for the next 30 years", interestedMonies/360);
                    System.out.println(output);
                    System.out.println("Proceed?");
                    System.out.println("");
                    String decision = scanner.nextLine();
                    if (decision.equalsIgnoreCase("yes")){
                        System.out.println("Congratulations! Enjoy your new home");
                    } else {
                        System.out.println("Okay, maybe next time.");
                    }
                }
            case "2":
                //prompt for the option we picked
                System.out.println("You have picked the car loan option");
                scanner = new Scanner(System.in);
                double carPrice = Double.parseDouble(scanner.nextLine());

                if (carPrice > 100000000){
                    System.out.println("Sorry we do not have that type of money. Your dream car is too expensive!");
                } else {
                    //process with the bank
                    double interestedMonies =  carPrice * 3.3;
                    //sleep with message for 2 sec..
                    System.out.println("Processing...");
                    Thread.sleep(4000);
                    String output = String.format("We will deduct N%.2f from your account every month for the next 30 years", interestedMonies/360);
                    System.out.println(output);
                    System.out.println("Proceed?");
                    System.out.println("");
                    String decision = scanner.nextLine();
                    if (decision.equalsIgnoreCase("yes")){
                        System.out.println("Congratulations! Enjoy your new home");
                    } else {
                        System.out.println("Okay, maybe next time.");
                    }
                }


        }




    }
    public int createAccount() {
        Random random = new Random();
        int upperLimit = 1000000000;
        int randomNumber = random.nextInt(upperLimit);
        this.accountNumber = randomNumber;
        String output = String.format("Hello %s Welcome to Redux Bank!", super.firstname);
        System.out.println(output);
        return accountNumber;
    }


    public void withdrawal(double amount) {
        if(amount < this.balance)
       this.balance = this.balance - amount;
        else{
            System.out.println("Insufficient funds");
        }
    }


    public void deposit(double amount) {
       this.balance = this.balance + amount;
    }


    public void checkBalance() {
        System.out.println("You currently have N" + getBalance());
    }

    private double getBalance() {
        return balance;
    }

    @Override
    public String[] splitNames(String names) {
        this.namesList = names.split(" ");
        return namesList;
    }
}
