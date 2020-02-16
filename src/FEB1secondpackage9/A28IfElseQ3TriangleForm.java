package FEB1secondpackage9;

public class A28IfElseQ3TriangleForm {
    public static void main(String[] args) {

        /*
        c1          c2        c3
        A+B>C &&    A+C>B    &&  B+C>A
        TRUE  and    TRUE   and   TRUE
         */

        int A=10;
        int B=15;
        int C=20;

        if ( (A+B>C) &&    (A+C>B)    &&  (B+C>A) ) {
            System.out.println("Can Form Triangle");
        }
        else {
            System.out.println("Can Not Form Triangle");
        }


    }
}
