package FEB1secondpackage9;
import java.util.Scanner;
public class A28IfElseQ1OddEven {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        System.out.println("Please enter a number :");

        int number = myscanner.nextInt();

        if (number % 2 == 1 ){
            System.out.println(number + " is odd number");
        }
        else {
            System.out.println(number + " is even number");
        }

    }
}
