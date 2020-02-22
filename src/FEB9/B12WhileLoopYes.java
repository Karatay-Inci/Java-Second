package FEB9;

import java.util.Scanner;

public class B12WhileLoopYes {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String answer= "";
        while (!answer.equalsIgnoreCase("Y")){
            System.out.print("Java is fun (Y/N) :");
            answer = scanner.next();
        }
        System.out.println("I knew like Java");
    }
}
