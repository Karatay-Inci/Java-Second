package FEB1secondpackage9;
import java.util.Scanner;
public class A30ProblemOfPurchase {
    public static void main(String[] args) {
        /*PURCHASE DECISION
        -color of the item : red:=20    blue = 10
        proice: tag price
        discount :percentage
        point of the item=tap price *percentage -color
            *if point >=100 do not buy
             *if point between 50-99 buy later
             *below 50 buy it now     */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the color (blur/red):");
        String color = scanner.nextLine();

        System.out.print("Please Enter Tag Price :");
        double priceTag = scanner.nextDouble();

        System.out.print("Please Enter Discount percentage (0.1-0.9): ");
        float discount = scanner.nextFloat();

        int colorValue=0;
        if(color.compareToIgnoreCase("red")==0){
            colorValue = 20;
        }
        else if (color.compareToIgnoreCase("blue")==0){
        }
        else {
            System.out.println("red or blue only");
        }
        int productPoint = (int)(priceTag*discount-colorValue);
        if (productPoint>=100){
            System.out.println("DO NOT BUY IT!");
        }
        else if(productPoint>=50){
            System.out.println("BUY IT LATER");
        }
        else {
            System.out.println("BUY IT RIGHT NOW!!!");
        }
    }
}

