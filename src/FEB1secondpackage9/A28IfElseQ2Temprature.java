package FEB1secondpackage9;
import java.util.Scanner;
public class A28IfElseQ2Temprature {
    public static void main(String[] args) {
        Scanner scanNumber = new Scanner(System.in);
        System.out.println("Enter temprature :");
        int temp = scanNumber.nextInt();

        if (temp<= 30 ){
            System.out.println("Wear a jacket");
        }
        else {
            System.out.println("Wear a hat");
        }
    }
}
