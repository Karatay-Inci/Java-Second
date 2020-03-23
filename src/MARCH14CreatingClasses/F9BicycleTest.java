package MARCH14CreatingClasses;

public class F9BicycleTest {
    public static void main(String[] args) {
        F9Bicycle myRedBike = new F9Bicycle(16,"Red");

            myRedBike.goFast();
            myRedBike.goFast(" crazy");
            myRedBike.goSlowly();

    System.out.println();

        F9Bicycle myBlueBike = new F9Bicycle(20,"Blue");

            myBlueBike.goFast();
            myBlueBike.goFast(" fun");
            myBlueBike.goSlowly();
                System.out.println(myBlueBike.size);
                System.out.println(myBlueBike.color);
    }
}
