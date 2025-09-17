package HierarchicalInheritance;
class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }

    public void displayAccountType() {
        System.out.println("Generic Bank Account");
    }
}
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}
class FixedDepositAccount extends BankAccount {
    private int maturityPeriod; 

    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}
public class BankSystemDemo {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("SAV123", 25000.0, 4.5),
            new CheckingAccount("CHK456", 15000.0, 5000.0),
            new FixedDepositAccount("FD789", 100000.0, 12)
        };

        for (BankAccount acc : accounts) {
            System.out.println("\n--- Account Details ---");
            acc.displayDetails();
            acc.displayAccountType();  
        }
    }
}
