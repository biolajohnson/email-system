package com.bankApplications.reduxBank;

public interface Accounts {
    int createAccount();
    void withdrawal(double amount);
    void deposit(double amount);
    void checkBalance();

}
