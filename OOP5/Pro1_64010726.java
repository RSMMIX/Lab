import java.util.*;
public class Pro1_64010726 {
    public static void main(String[] args) {
        
    }
}

class Account{
    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;
    private Date dateCreated;

    public Account(){
        dateCreated = new Date();
    }

    public Account(int id, double blance){
        this.id = id;
        this.balance = balance;
    }

    public double getMonthlyInterestRate(){
        return (annualInterestRate / 100) / 12; 
    }

    public double getMonthlyInterest(){
        return balance* getMonthlyInterestRate();
    }

}
