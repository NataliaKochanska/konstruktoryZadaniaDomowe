package zadania.domowe;

public class BankAccount {
    private int number;
    private double cash;
    private int newNumber;

    public BankAccount() {
        if(this.number == this.newNumber) {
            this.cash = 0;
        } }

    public BankAccount(int number) {
        this.number = number;
    }

    public int getNumber () {
        return number;
    }

    public double getCash () {
        return cash;
    }

    public void depostitCash ( double amount){
        if (amount > 0) {
            this.cash += amount;
        } else {
            System.out.println("Podano błędną wartość.");
        }
    }

    public void withdrawCash ( double amount){
        if (amount > 0) {
            if (amount >= this.cash) {
                this.cash = 0;
                return amount;
            } else {
                this.cash = this.cash - amount;
                return amount;
            }
        } else {
            System.out.println("Podano błędną wartość.");
        }
    }

    public String printInfo () {
        return "Numer konta: " + this.number + " Stan konta: " + this.cash;

    }



}
