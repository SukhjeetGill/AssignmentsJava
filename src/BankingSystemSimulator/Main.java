package BankingSystemSimulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double deposit, withdraw;
        int depositcount=0;
        int withdrawcount=0;
        double amountwithdrawn=0;
        double amountdeposit=0;
        Bank bank = new Bank(1000);
        boolean b=true;
        while(b){
            System.out.println();
            System.out.println("Select from below: ");
            display();
            char ch = sc.next().charAt(0);
        switch (ch) {
            case 'a':
                System.out.println("Account balance: " + bank.getBalance());
                break;
            case 'b':
                System.out.println("Enter the deposit amount: ");
                deposit = sc.nextDouble();
                if (deposit>0){
                bank.setBalance(deposit);
                System.out.println("Deposit successful!\n" + "Balance after deposit: " + bank.balance);
                depositcount++;
                amountdeposit += deposit;}
                else System.out.println("Enter a positive number");
                break;
            case 'c':
                System.out.println("Enter the withdrawal amount: ");
                withdraw = sc.nextDouble();
                if (withdraw < bank.getBalance()) {
                    bank.withdrawal(withdraw);
                    System.out.println("Balance after withdrawal: " + bank.balance);
                    withdrawcount++;
                    amountwithdrawn += withdraw;
                } else {
                    System.out.println("Insufficient funds");
                }
                break;
            case 'd':
                System.out.println("Account summary: ");
                System.out.println("Current balance: " + bank.getBalance());
                System.out.println("Total no of deposits: " + depositcount);
                System.out.println("Total no of withdrawals: " + withdrawcount);
                System.out.println("Total amount withdrawn: " + amountwithdrawn);
                System.out.println("Total amount deposit: " + amountdeposit);
                break;
            case 'e':
                System.out.println("Exiting the program. Thank you!");
                b = false;
                break;
                //System.exit(0);
            default:
                System.out.println("Invalid input");
        }
        }
    }
    public static void display(){
        System.out.println("a. Check Account Balance\n" +
                "b. Make a Deposit\n" +
                "c. Make a Withdrawal\n" +
                "d. Print Account Summary\n" +
                "e. Exit\n");
    }
}
