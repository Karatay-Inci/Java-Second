package FEB9;
import java.util.Scanner;
public class B10Question1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter starting point : ");        //!!!!!!!!!!start nu< end nu
        int start= scanner.nextInt();

        System.out.print("Enter end point : ");
        int end  =scanner.nextInt();

        System.out.print("Enter what you want to print : ");
        String toprint=scanner.next();

        for(int i=start;    i<end;   i++){

            System.out.println(toprint);

        }

    }
}