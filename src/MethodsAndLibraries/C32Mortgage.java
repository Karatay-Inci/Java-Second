package MethodsAndLibraries;

public class C32Mortgage {
    public static void main(String[] args) {
        System.out.println(calculateMortgage(2400,15));
    }
    public static int calculateMortgage(int monthly, int mountNum ){
        int totalAmount=350000;

        int restPayment= totalAmount-monthly*mountNum;
        return restPayment;
    }
}
