package MARCH14CreatingClasses;

public class F3ConvertLength {
    //Write a method to convert inch to cm and cm to inch use method overloading
    public static void main(String[] args) {
        System.out.println(convertLength(10));
        System.out.println(convertLength(10.0));
    }

    public static double convertLength(int cm) {
        return cm * 2.54;
    }

    public static double convertLength(double inch) {
        return inch / 2.54;
    }
}
