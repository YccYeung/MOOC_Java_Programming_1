public class Debt {
    
    private double balance;
    private double interestrate;

    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestrate = initialInterestRate;
    }

    public void printBalance() {
        System.out.println(this.balance);
    }

    public void waitOneYear() {
        this.balance = this.balance * this.interestrate;
    }
}
