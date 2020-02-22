package FEB9;
import java.util.Scanner;
public class B11NumberGuessingGame {
    public static void main(String[] args) {
        /*
   -Number Guessing Game
        =Create a variable and assign any integer number
        -Ask from user to guess that number
        -If input number is larger than variable value than print "Larger , try again"
        -If input number is less than variable value than print "Smaller , try again"
        -If they are equal than print "Congrats"
         */
        int numberToGuess = 23;
        //first time asking user
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Guess the number : ");
        int userGuess = myScanner.nextInt();

        //Asking user until user guesses the number
        while (userGuess != numberToGuess) {
            System.out.print("Guess the number : ");
            userGuess = myScanner.nextInt();

            userGuess = myScanner.nextInt();

            if (userGuess > numberToGuess) {
                System.out.println("Number is larger");
            } else if (userGuess < numberToGuess) {
                System.out.println("NUmber is smaller");
            } else {
                System.out.println("Congrats...");
            }
        }
    }
}


