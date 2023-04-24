package model;

public class BankAccount {
    private String accountNumber;
    private String amount;
    private String currency;

    public BankAccount(String accountNumber, String amount, String currency) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.currency = currency;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", amount='" + amount + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }
}
