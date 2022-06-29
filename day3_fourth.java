class BankAccount {
    private double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        if (amount <= 5000.00) {
            this.balance += amount;
        } else {
            System.out.println("Transaction canceled. Max deposit - 5000 | Your deposit: " + amount);
        }
    }
    public void withdraw(double amount){
        if(this.balance - amount >= 0) {
            this.balance -= amount;
        } else {
            System.out.println("There is not enough funds.");
        }
    }
    public void printBalance(){
        System.out.println(this.balance);
    }
    public double transferFrom(double amount){
        if(this.balance - amount >= 0){
            this.balance -= amount;
        } else {
            System.out.println("Transfer canceled. You are trying to transfer "+ amount + " units, but only " + this.balance + " are available.");
        }
        return amount;
    }
}

public class day3_fourth {
    public static void main(String[] args){
        BankAccount acc = new BankAccount(12.01);
        acc.withdraw(13.00);
        acc.deposit(5001.00);
        BankAccount acc2 = new BankAccount(acc.transferFrom(14.00));
    }
}
