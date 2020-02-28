package MethodsAndLibraries;

import java.util.Scanner;

public class NumberGuessing {
    public static void guessTheNumber(int number) {
        Scanner myScan=new Scanner(System.in);
        int userGuess=0;
        while(userGuess!=number){
            System.out.println("Guess the number: ");
            userGuess=myScan.nextInt();

            if (userGuess==number){
                System.out.println("CONGRAST");
            }
            else if (userGuess>number){
                System.out.println("Try smaller");
            }
            else{
                System.out.println("Try larger");
            }
        }
    }
}
