import java.util.Scanner;

class BankAccount {

    // Data members
    long accountNumber;
    String accountHolderName;
    double balance;

    // Parameterized constructor
    BankAccount(long accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Check balance method
    double checkBalance() {
        return balance;
    }

    // Display account details
    void displayAccount() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number   : " + accountNumber);
        System.out.println("Account Holder   : " + accountHolderName);
        System.out.println("Balance          : " + balance);
    }
}

public class BankManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read account details
        System.out.print("Enter Account Number: ");
        long accountNumber = sc.nextLong();

        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = sc.next();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        // Create object using parameterized constructor
        BankAccount account =
            new BankAccount(accountNumber, accountHolderName, balance);

        // Deposit operation
        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        // Withdrawal operation
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        // Display final account details
        account.displayAccount();

        // Check final balance
        System.out.println("Final Balance    : " + account.checkBalance());

        sc.close();
    }
}