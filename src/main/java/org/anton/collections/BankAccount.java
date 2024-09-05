package org.anton.collections;

import lombok.AllArgsConstructor;
import lombok.Getter;

// Bank Account With Currency And Balance Validation

@Getter
@AllArgsConstructor
public class BankAccount {
    private long accountNumber;
    private String accountCurrency;
    private double balance;

    public void deposit(String currency, double amount) {
        if (currency.equals(accountCurrency)) balance += amount;
        else {
            if (accountCurrency.equals("usd")) balance += amount * 1.2;
            else balance += amount / 1.2;
        }
    }

    public void withdraw(String currency, double amount) {
        if (currency.equals(accountCurrency)) {
            if (balance >= amount) balance -= amount;
            else throw new IllegalArgumentException("Insufficient funds");
        } else {
            double convertedAmount;
            if (accountCurrency.equals("usd")) convertedAmount = amount * 1.2;
            else convertedAmount = amount / 1.2;
            if (balance >= convertedAmount) balance -= convertedAmount;
            else throw new IllegalArgumentException("Insufficient funds");
        }
    }
}
