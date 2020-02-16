package FEB1secondpackage9;
import java.util.Scanner;
public class A28IfElseQ4Age {
    public static void main(String[] args) {
//Check age information.It must be between 1-120.
        //Age < 0 print cannot be negative
        //Age>120 print cannot be larger than 120
        //If it is valid print OK

        /*
if (age>120)<--------checek first
        not larger than 120
 else if (age<0)<-----than this
        not negatif
 else if <-----------vanne of them than this
 */
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter an age :");
        int age = myScan.nextInt();
        if (age<0){
            System.out.println("Not negative numbers");
        }
        else if (age>120){
            System.out.println("Cannot be larger than 120");
        }
        else {
            System.out.println("OK");

        }
    }
}
