package FEB29Arrays;

import MARCH11Review.E3FindCapitalLetters;

public class E3FindCapitalLettersTest {
    public static void main(String[] args) {
        String mySentence="This is our Java Class";
        decideString(mySentence);

    }
    public static void decideString(String sentence){
        int numCapitals= E3FindCapitalLetters.countAllCapitals(sentence);
        if (numCapitals>4){
            System.out.println("Accepted");
        }
        else{
            System.out.println("Rejected");
        }
    }
}
