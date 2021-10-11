import java.util.Random;

package Bank_Account;

public class BankAccount {
    //Attributes / fields
    private String accountNumber;
    private double checkingsBalance;
    private double savingsBalance;
    private static int numberOfAccounts;
    private static double totalMoney;

    //Constructors
    Public BankAccount() {
        this.accountNumber = this.randAccountNumber();
        this.checkingsBalance = 0;
        this.savingsBalance = 0;
        numberOfAccounts++;
    }

    //Methods
    private String randAccountNumber() {
        String accountNumber = "";
        Random r = new Random();
        for (int i=0; i<10; i++) {
            accountNumber = accountNumber.concat(String.valueOf(r.nextInt(10)));
        }
        return accountNumber;
    }
    //Deposit to Chk or Sav
    public void depositMoney(double amount, String accountType) {
        if (accountType.equals("checking")) {
            this.setCheckingsBalance(this.getCheckingsBalance() + amount);
        } else if (accoutType.equals("saving")) {
            this.setSavingsBalance(this.getSavingsBalance() + amount);
        } else {
            System.out.println("Invalid Account Type");
            return;
        }
        totalMoney += amount;
    }

    //Withdraw Money
    public void withdrawMoney(double amount, String accountType) {
        if (accountType.equals("checking")) {
            if (this.getCheckingsBalance() - amount < 0 ) {
                System.out.println("Insufficient Funds");
            } else {
                this.setCheckingsBalance(this.getCheckingsBalance() - amount);
                totalMoney -= amount;
            }
        } else if (accountType.equals("saving")) {
            if (this.getSavingsBalance()) - amount < 0) {
                System.out.println("Insufficient Funds");
            } else {
                this.setSavingsBalance(this.getSavingsBalance() - amount);
                totalMoney -= amount;
            }
        } else {
            System.out.println("Invalid Account Type");
            return;
        }
    }

    //Account Total
    public String getAccountTotal() {
        return "Total Money in the Account: " + this.getCheckingBalance() + this.getSavings
    }

    //Getters & Setters
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCheckingBalance() {
        return checkingsBalance;
    }

    public void setCheckingsBalance(double checkingsBalance) {
        this.checkingsBalance = checkingsBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    
    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public static void setNumberOfAccounts(int numberOfAccounts) {
        BankAccount.numberOfAccounts = numberOfAccounts;
    }
        
    }
}
