package miniprojects;

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

}
