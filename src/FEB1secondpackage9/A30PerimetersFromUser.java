package FEB1secondpackage9;
import java.util.Scanner;
public class A30PerimetersFromUser {
/*Ask user to calculate different shapes perimeter.Shapes;
      -Circle (input must be "C")              -->request radius and calculate perimeter : 2*3.14*radius
      -Rectangle widht and hight and calculate perimeter : 2*(w+h)
      -Triangle (input must be "T")
      -Request edges and calculate perimeter: e1+e2+e3
       */
    public static void main(String[] args) {
      //Creating Scanner object to read from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter C,R, or T :");
        //Receiving answer form the user
        String shape = scanner.next();
        if (shape.compareToIgnoreCase("c")==0){  //For the Circle
//ask radius from user
            System.out.print("Please enter the radius :");
            double radius = scanner.nextDouble();
            System.out.println(2*3.14*radius);
        }
        else if (shape.compareToIgnoreCase("r")==0){
//ask width and height from user
            System.out.print("Please enter width :");
            int width = scanner.nextInt();
            System.out.println("Please enter hight :");
            int height = scanner.nextInt();
            System.out.println(2*(width+height));
        }
        else if (shape.compareToIgnoreCase("t")==0){
//ask edges from user
            System.out.println("Please enter edge 1 : ");
            int edge1 = scanner.nextInt();
            System.out.println("Please enter edge 2 : ");
            int edge2 = scanner.nextInt();
            System.out.println("Please enter edge 3 : ");
            int edge3 = scanner.nextInt();
            System.out.println(edge1+edge2+edge3);
        }
        else {
            System.out.println("Please C,R or T");
        }
    }
}
