public class SavingsAccount extends Account{
    private double overdraftLimit = 0;
    
    public SavingsAccount(){
        super();
    }

    public SavingsAccount(int id , double balance){
        super(id, balance);
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        }
        else{
            System.out.println("Error");
        }
    }
}
