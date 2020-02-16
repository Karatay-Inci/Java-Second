package FEB1secondpackage9;
import java.util.Scanner;
public class A18CirclePerimeterInput {
    public static void main(String[] args) {
            Scanner myScan = new Scanner(System.in);
            float radius;
            System.out.print("Please enter the radius : ");
            radius = myScan.nextFloat();
            System.out.println("The perimeter of this circle is : "+(2*3.14*radius));
            System.out.format("Perimeter with 3 fractional part : %.3f ",2*3.14*radius);

            /*
            write down
            6.8
            = 42.70400119781495
            =42.704
             */
        
    }
}
