package FEB1secondpackage9;
import java.util.Scanner;
public class A28IfElseQ5Seasons {
    public static void main(String[] args) {
 // For given temperature print the season
        //20 and below Winter
        //21-40 Fall
        //41-60 Spring
        //61 and above Summer
//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a temperature : ");
        int temp = scanner.nextInt();
        if (temp<=20) {
            System.out.println("Winter");
        }
        else if (temp > 20 && temp < 41) {
            System.out.println("Fall");
        }
        else if(temp > 40 && temp < 61) {
            System.out.println("Spring");
        }
        else  {
            System.out.println("Summer");
        }

    }
}

