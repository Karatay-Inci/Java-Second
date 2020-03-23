package MARCH14CreatingClasses;

public class F10BankAccountTest {
    public static void main(String[] args) {
        F10BankAccount myAcc = new F10BankAccount("saving",500.9,1234567);
        myAcc.checkBalance();
        myAcc.addMoney(500);
        myAcc.checkBalance();
        myAcc.drawMoney(1600);
        myAcc.checkBalance();
        myAcc.drawMoney(1000);
        myAcc.checkBalance();
    }
}
