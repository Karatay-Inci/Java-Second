package secondpackage;
import java.util.Scanner;
public class A12ReadFromKeyboard {
    public static void main(String[] args) {
        Scanner readKeyboard = new Scanner(System.in);
        System.out.println("Please Enter your Name");
        String myName = readKeyboard.nextLine();
        System.out.println("Your name is:" + myName);
    }
}
