
public class BankAccountTester {

    public static void main(String[] args) {
        //todo auto-generated method stub
        BankAccount myBankAccount = new BankAccount();
        myBankAccount.depositMoney(10, "saving");
        System.out.println(myBankAccount.getAccountTotal());
        myBankAccount.depositMoney(100, "saving");
        System.out.println(myBankAccount.getAccountTotal());
        System.out.println(BankAccount.getNumberOfAccount());
        System.out.println(BankAccount.getTotalMoney());
        myBankAccount.withdrawMoney(10000, "checking");
        myBankAccount.withdrawMoney(60, "saving");
        System.out.println(myBankAccount.getAccountTotal());
    }
    
}
