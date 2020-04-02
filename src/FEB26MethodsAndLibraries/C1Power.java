package FEB26MethodsAndLibraries;

import java.util.Scanner;

public class C1Power {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter base number: ");
        int base=scanner.nextInt();
        System.out.print("Enter power number: ");
        int power=scanner.nextInt();

        System.out.println((int)Math.pow(base,power));  //Math.pow= it is used to calculate a number raise to the power of some other number.
    }
}
