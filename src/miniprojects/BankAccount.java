package miniprojects;

import java.util.Scanner;

public class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    BankAccount(String cname, String cid){
        customerName = cname;
        customerID = cid;
    }

    void deposit(int amount){
        if (amount>0){
            balance = balance+amount;
            previousTransaction = amount;
        }

    }
    void withdraw(int amount){
        if (amount>0){
            balance = balance-amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction(){
        if (previousTransaction>0){
            System.out.println("Deposited: " + previousTransaction );
        }
        else if (previousTransaction<0)
            System.out.println("Withdrawn: "+ Math.abs(previousTransaction));
        else System.out.println("No transaction took place");
    }

    void showMenu(){
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome "+ customerName);
        System.out.println("Your ID is "+ customerID);
        System.out.println();
        System.out.println("A: Check Balance");
        System.out.println("B: Deposit");
        System.out.println("C: Withdraw");
        System.out.println("D: Previous Transaction");
        System.out.println("E: Exit");

        do {
            System.out.println("=======================================================");
            System.out.println("Select an option");
            System.out.println("=======================================================");
            option = scanner.next().charAt(0);
            System.out.println();
            switch (option){
                case 'A':
                    System.out.println("-------------------------------------");
                    System.out.println("Balance = "+ balance);
                    System.out.println("--------------------------------------");
                    System.out.println();
                    break;

                case 'B':
                    System.out.println("-------------------------------------");
                    System.out.println("Enter an amount to deposit");
                    System.out.println("--------------------------------------");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;
                case 'C':
                    System.out.println("-------------------------------------");
                    System.out.println("Enter an amount to withdraw");
                    System.out.println("--------------------------------------");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println();
                    break;
                case 'D':
                    System.out.println("-------------------------------------");
                    getPreviousTransaction();
                    System.out.println("--------------------------------------");
                    System.out.println();
                    break;

                case 'E':
                    System.out.println("***********************************");
                    break;
                default:
                    System.out.println("Invalid option. Please select another option");
                    break;

            }


        }while (option!='E');
        System.out.println("Thank you for using our services");



    }


}
