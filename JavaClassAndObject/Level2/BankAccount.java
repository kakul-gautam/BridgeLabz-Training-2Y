package Level2;
import java.util.Scanner;

public class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor to initialize BankAccount object
    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    // Method to withdraw money if sufficient balance
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Method to display current balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String accountHolder = scanner.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        BankAccount account = new BankAccount(accountHolder, accountNumber, balance);

        System.out.print("Enter deposit amount: ");
        double depAmount = scanner.nextDouble();
        account.deposit(depAmount);

        System.out.print("Enter withdraw amount: ");
        double witAmount = scanner.nextDouble();
        account.withdraw(witAmount);

        account.displayBalance();

        scanner.close();
    }
}
