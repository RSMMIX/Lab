import java.util.*;
class Account {
    protected String name;
    protected int id;
    protected double balance;
    protected double annualInterestRate;
    protected Date dateCreated;
    protected ArrayList<Transaction> transactions = new ArrayList<>();
    
    public Account() {
        dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public Account(String name, int id, double balance){
        this(id,balance);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate(){
        return (annualInterestRate / 12); 
    }

    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate() /100;
    }

    public void withdraw(double amount){
        balance -= amount;
        transactions.add(new Transaction('W', amount, balance,""));
    }

    public void deposit(double amount){
        balance += amount;
        transactions.add(new Transaction('D', amount, balance,""));
    }
}