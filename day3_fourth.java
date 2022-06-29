class BankAccount {
    private double balance;
    public void BankAccount(double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        this.balance += amount;
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
    public double transfer(){
        return this.balance;
    }
}

public class day3_fourth {
    public static void main(String[] args){

    }
}
