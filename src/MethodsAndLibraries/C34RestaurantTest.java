package MethodsAndLibraries;

import java.util.Scanner;

public class C34RestaurantTest {
    public static void main(String[] args) {
        C34Restaurant.showMenu();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Choose your soup (1-Lentil, 2-Tomato, 3-Fish)");
        int soup=scanner.nextInt();
        System.out.print("Choose your meal (1-Rice, 2-Chicken, 3-Beef)");
        int meal=scanner.nextInt();
        System.out.print("Choose your salad (1-Ceaser, 2-Waldorf)");
        int salad=scanner.nextInt();

        C34Restaurant.printReceipt(soup,meal,salad);
    }
}
