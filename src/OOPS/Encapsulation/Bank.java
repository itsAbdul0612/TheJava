package OOPS.Encapsulation;

public class Bank {
    private long accountNumber;
    private int balance;
    private int deposit;
    private int withdraw;


    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void Deposit(int deposit) {
        if (deposit <= 0){
            System.out.println("Invalid Amount");
        }
        this.balance += deposit;
    }

    public void Withdraw(int withdraw) {
        if (withdraw <= 0){
            System.out.println("Invalid amount");
        } else if (balance == 00){
            System.out.println("Insufficient Balance");
        }
        this.balance -= withdraw;
    }
}
