interface Loanable {
    boolean applyForLoan(double amount);
    double calculateLoanEligibility();
}
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getHolderName() { return holderName; }
    public void setHolderName(String holderName) { this.holderName = holderName; }

    public double getBalance() { return balance; }
    protected void setBalance(double balance) { this.balance = balance; }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + ". New balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + ". New balance: ₹" + balance);
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }
    public abstract double calculateInterest();
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.04; 

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public boolean applyForLoan(double amount) {
        return amount <= calculateLoanEligibility();
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2; 
    }
}
class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.01; 

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public boolean applyForLoan(double amount) {
        return amount <= calculateLoanEligibility();
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 1.5; 
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("SB1001", "Kakul Sharma", 50000),
            new CurrentAccount("CA2001", "Rajiv Mehta", 80000)
        };

        for (BankAccount acc : accounts) {
            acc.displayDetails();
            double interest = acc.calculateInterest();
            System.out.println("Calculated Interest: ₹" + interest);

            if (acc instanceof Loanable) {
                Loanable loanAcc = (Loanable) acc;
                double eligibility = loanAcc.calculateLoanEligibility();
                System.out.println("Loan Eligibility: ₹" + eligibility);
                boolean approved = loanAcc.applyForLoan(40000);
                System.out.println("Loan Application for ₹40000: " + (approved ? "Approved" : "Rejected"));
            }

            System.out.println("---------------------------");
        }
    }
}
