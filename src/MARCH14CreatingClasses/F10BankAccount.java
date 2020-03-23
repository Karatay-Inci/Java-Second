package MARCH14CreatingClasses;

public class F10BankAccount {
    String accountName;
    double balance;
    int accountNumber;
    public F10BankAccount(String accountName,double balance, int accountNumber){
        this.accountName = accountName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public void checkBalance(){
        System.out.format("$%.2f\n",this.balance);
    }
    public void addMoney(){
        this.balance += 10;
    }
    public void addMoney(double amount){
        this.balance += 10;
    }
    public void drawMoney(){
        this.balance -= 10;
    }
    public void drawMoney(double amount){
        if (amount>this.balance){
            System.out.println("Not enough balance");
        }
        else{
            this.balance -= amount;
        }
    }
}
