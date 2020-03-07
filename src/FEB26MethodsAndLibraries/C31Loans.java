package FEB26MethodsAndLibraries;

public class C31Loans {
    public static void main(String[] args) {
        System.out.println(calculateCarLoan(400,15));
        System.out.println(calculateCarInsurance(24000,36));
    }
    public static int calculateCarLoan(int monthly,int mountNum){
        int totalAmount=35000;

        int restPayment=totalAmount-monthly*mountNum;
        return restPayment;
    }
    public static double calculateCarInsurance(int totalCarPrice, int monthNum){
        double result;
        int monthly = 230;
        result = (totalCarPrice/monthNum)*0.9-monthNum;
        return result;
    }
}
