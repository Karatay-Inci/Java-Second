package FEB1secondpackage9;
import java.util.Scanner;
public class
A30Problem1Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Grade : ");
        int grade = scanner.nextInt();
        if (grade>= 90 && grade<=100){
            System.out.println("A");
        }
        else if (grade>= 80 && grade<=89){
            System.out.println("A");
        }
        else if (grade>= 70 && grade<=79){
            System.out.println("A");
        }
       else if (grade>= 60 && grade<=69){
            System.out.println("A");
        }
        else if (grade>= 50 && grade<=59){
            System.out.println("A");
        }
       else  if (grade>= 0 && grade<=49){
            System.out.println("A");
        }
        else {
            System.out.println("invalid ");
        }
    }
}
