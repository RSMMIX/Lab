import java.util.*;
public class Pro1_64010726 {
    public static void main(String[] args) {
        Account acc = new Account(1122,20000);
        acc.setAnnualInterestRate(4.5);
        acc.withdraw(2500.0);
        acc.deposit(3000.0);
        System.out.println("Balance: "+acc.getBalance());
        System.out.println("Monthly interest: "+acc.getMonthlyInterest());
        System.out.println("Created: "+acc.getDateCreated());
    }
}

class Account{
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private Date dateCreated;

    public Account(){
        dateCreated = new Date();
    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }


    public double getMonthlyInterestRate(){
        return (annualInterestRate / 100) / 12; 
    }

    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

}
