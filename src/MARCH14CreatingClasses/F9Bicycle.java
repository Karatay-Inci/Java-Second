package MARCH14CreatingClasses;

public class F9Bicycle {
    int size;
    String color;
    public F9Bicycle(int bikeSize, String bikeColor){
        size=bikeSize;
        color=bikeColor;
    }
    public void goFast(){
        System.out.println("Going fast");
    }
    public void goFast(String level){
        System.out.println("Going"+level+"fast");
    }
    public void goSlowly(){
        System.out.println("Cruising slowly");
    }
}
