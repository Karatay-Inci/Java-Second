package secondpackage;
import java.util.Scanner;
public class A19CarPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int MSRP;
        MSRP = scanner.nextInt();
        int discount = scanner.nextInt();
        int months = scanner.nextInt();
        double monthlypayment = (MSRP*((float)(100-discount)/100))/months;
        System.out.println("Monthly payment is : "+monthlypayment);

        /*
            write down
            20000
            20
            Montly payment=1333.3333...

            */

    }
}
