class BankAccount {
    public double balance;
    public void BankAccount(double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        this.balance -= amount;
    }
    public void printBalance(){
        System.out.println(this.balance);
    }
    public double transfer(){
        return this.balance;
    }
}

public class day3_third {
    public static void main(String[] args){

    }
}
