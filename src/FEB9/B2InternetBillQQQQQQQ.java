package FEB9;

import java.util.Scanner;

public class B2InternetBillQQQQQQQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Subcribed? (Y/N)");
        String member = scanner.next();

        if (member.equalsIgnoreCase("Y")){
            //ask usage
            System.out.println("Enter usage please (1-100) :");
            int usage = scanner.nextInt();
            if (usage<101){
                System.out.println("$10");
            }
            else {
                System.out.println("$40");
            }
        }
        else if (member.equalsIgnoreCase("N")){
            System.out.println("please subscribe");
        }
        else {
            System.out.println("Only Y/N");
        }
    }

}
