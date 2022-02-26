import java.util.*;

public class Pro1_64010726 {
    public static void main(String[] args) {
        Account acc = new Account();
        CheckingAccount checking = new CheckingAccount(0,5000,5000);
        SavingsAccount savings = new SavingsAccount();
        System.out.println("Checking Account");
        System.out.println("Overdraft Limit: "+checking.getOverdraftLimit());
        System.out.println("Balance is "+checking.getBalance());
        System.out.println("Withdraw: 10000.00");
        checking.withdraw(10000);
        System.out.println("Balance is "+checking.getBalance());
        System.out.println("This account was created at "+checking.getDateCreated());
    }
}
