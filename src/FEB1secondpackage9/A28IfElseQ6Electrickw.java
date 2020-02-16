package FEB1secondpackage9;
import java.util.Scanner;
public class A28IfElseQ6Electrickw {
    /*
    consumption below 500       $0.3 per kw
    consumption      500-1000   $0.4 per kw
    consumption      1000-2000  $0.5 per kw
    consumption      2000  above $0.6 per kw
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your consumption :");
        int myConsumption = scanner.nextInt();
        double electricBill;

        if (myConsumption < 501) {
            electricBill = myConsumption*0.3;
        }
        else if (myConsumption<1001) {
            electricBill = myConsumption*0.4;
        }
        else if (myConsumption<2001) {
            electricBill = myConsumption*0.5;
        }
        else {
            electricBill = myConsumption*0.6; // without 0 double numbers are ok.like .5456
        }
        System.out.format("$%.2f" ,electricBill);
    }
}

