package FEB9;
import java.util.Scanner;
public class B7MathVSArt {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Math or Art? :");
        String choise = scanner.next();

        if (choise.equalsIgnoreCase("math")){

            System.out.print("Tutor(Y/N) :");
            String tutor = scanner.next();
            if (tutor.equalsIgnoreCase("y")){
                System.out.println("OK");
            }
            else if (tutor.equalsIgnoreCase("n")){
                System.out.println("Study your self");
            }
            else {
                System.out.println("Y OR N please!!");
            }
        }
        else if (choise.equalsIgnoreCase("art")){
            System.out.println("Nice choise");
        }
        else {
            System.out.println("Only art or math");
        }
    }
}
