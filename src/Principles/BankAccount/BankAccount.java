package Principles.BankAccount;

import java.util.Date;

public interface BankAccount {
    // Those methods about bankAccount
    Date getCreationDate();
    double getBalance();
    double getInterestRate();
    void deposit(double amount);
    void withdraw(double amount);
}
