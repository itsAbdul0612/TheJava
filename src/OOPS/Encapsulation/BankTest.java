package OOPS.Encapsulation;

public class BankTest {
    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.setAccountNumber(232321349);
        System.out.println(bank.getAccountNumber());

        System.out.println(bank.getBalance());
        bank.Deposit(100);
        System.out.println(bank.getBalance());
        bank.Withdraw(50);
        System.out.println(bank.getBalance());


    }
}
