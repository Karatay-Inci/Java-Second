package MARCH14CreatingClasses;

public class F4JustTest {
    public static void main(String[] args) {
        System.out.println("java fun (from main)");
        F4JustTest.main("its fun");
    }
    public static void main(String arg1) {
        System.out.println("yes " + arg1);
        F4JustTest.main("its fun ", "indeed");
    }
    public static void main(String args1 , String args2) {
        System.out.println("right " + args1  + args2);
    }
}
