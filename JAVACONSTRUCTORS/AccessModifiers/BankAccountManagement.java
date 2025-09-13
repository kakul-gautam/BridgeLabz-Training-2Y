package AccessModifiers;
class BankAccount {
    public String accountNumber;       
    protected String accountHolder;    
    private double balance;            
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double amount) {
        if (amount >= 0) {
            this.balance = amount;
        } else {
            System.out.println("Invalid balance amount.");
        }
    }
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }
}
class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsInfo() {
        System.out.println("Savings Account Number: " + accountNumber);     
        System.out.println("Account Holder Name: " + accountHolder);        
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
public class BankAccountManagement {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("SBIN123456", "Kakul Sharma", 15000.0);
        acc1.displayAccountInfo();
        acc1.setBalance(18000.0);
        System.out.println("Updated Balance: ₹" + acc1.getBalance());

        System.out.println("\n--- Savings Account Info ---");
        SavingsAccount savAcc = new SavingsAccount("SBIN789012", "Kakul Sharma", 25000.0, 4.5);
        savAcc.displayAccountInfo();     
        savAcc.displaySavingsInfo();      
    }
}
