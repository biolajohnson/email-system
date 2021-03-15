package com.bankApplications.reduxBank;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws InterruptedException {
    Scanner scanner = new Scanner(System.in);
    String userInput = scanner.nextLine();
    Account newAccount = new Account(userInput);
    Thread.sleep(3_000);
    newAccount.takeLoans();

//    newAccount.createAccount();
//    newAccount.deposit(100000);
//    newAccount.checkBalance();
//    newAccount.withdrawal(300);
//    newAccount.checkBalance();
//    newAccount.withdrawal(400000000);
    }
}
