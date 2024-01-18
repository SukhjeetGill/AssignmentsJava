package BankingSystemSimulator;

public class Bank {
    double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }

    public void withdrawal(double withdraw){
         this.balance -= withdraw;
    }
}
