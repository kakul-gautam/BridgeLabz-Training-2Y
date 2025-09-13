public class BankAccount {
    static String bankName = "State Bank of India";
    private static int totalAccounts = 0;
    public final String accountNumber;
    private String accountHolderName;
    private double balance;
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;          
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;         
    }
    public static void getTotalAccounts() {
        System.out.println("Total Bank Accounts: " + totalAccounts);
    }
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: ₹" + balance);
        } else {
            System.out.println("Invalid account object.");
        }
    }
    public void setBalance(double newBalance) {
        if (newBalance >= 0) {
            this.balance = newBalance;
        } else {
            System.out.println("Invalid balance amount.");
        }
    }
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("SBIN001", "Kakul Sharma", 25000.0);
        BankAccount acc2 = new BankAccount("SBIN002", "Ravi Kumar", 40000.0);

        acc1.displayAccountDetails();
        System.out.println();

        acc2.setBalance(45000.0);
        acc2.displayAccountDetails();
        System.out.println();

        BankAccount.getTotalAccounts(); 
    }
}
