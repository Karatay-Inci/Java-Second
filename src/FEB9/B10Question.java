package FEB9;

public class B10Question {
    public static void main(String[] args) {
        //Print Hello world like given:
        //Hello (outer loop) World World World (inner loop)
        for (int i = 0; i < 1; i++) {
            System.out.print("Hello ");
            for (int j = 21; j < 24; j++) {
                System.out.print(" world");

            }
        }
        //Print Hello world like given:
        //Hello Hello Hello ( linner oop) World (outer loop)
        System.out.println();
        for (int i = 1; i <= 1; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Hello ");
            }
            System.out.println(" World");
        }
    }
}