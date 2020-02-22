package FEB1secondpackage9;
import java.util.Scanner;
public class A28IfElseQ7Applicant {
    public static void main(String[] args) {
        /*
        age between 20-30 and Java point >=80:age*1.5+Java point*4.5
        age between 20-30 and Java point <80:age*1.5+Java point*3.5
        age 31 above and Java point >=80:age*1.1+Java point*4.5
        age 31 above and Java point < 80:age*1.1+Java point*3.5
         */
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Please enter your age :");
        //System.out.println("Please enter your score :");
        //int age = scanner.nextInt();

        int age = 20;
        int javaScore = 90;

        if ((age >=20 && age < 30) && javaScore>=80){
            System.out.println(age*1.5+javaScore*4.5);
        }
        else if ((age >=20 && age <= 30) && javaScore < 80) {
            System.out.println(age*1.5+javaScore*3.5);
        }
        else if (age > 30 && javaScore >= 80){
            System.out.println(age*1.1+javaScore*4.5);
        }
            else if (true){
        }
            else {
            System.out.println("Please enter a valid age or java Score ");
        }
        }

}
