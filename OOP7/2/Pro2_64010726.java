import java.util.*;
public class Pro2_64010726 {
    public static void main(String[] args) {
        Account acc = new Account(1122,1000);
        acc.setAnnualInterestRate(1.5);
        acc.setName("George");
        acc.deposit(30);
        acc.deposit(40);
        acc.deposit(50);

        acc.withdraw(5);
        acc.withdraw(4);
        acc.withdraw(2);
  
        System.out.println("Name: "+acc.getName());
        System.out.println("Account ID: "+acc.getId());
        System.out.println("Annual interest rate: "+acc.getAnnualInterestRate());
        System.out.println("Balance: "+acc.getBalance());
        System.out.println("Date                              Type           Amount         Balance");
       
        for (Transaction t : acc.getTransactions()) {
            System.out.println(t.getDate() + "       " + t.getType() + "              " + t.getAmount() + "          " + t.getBalance());
        }
    }
}
