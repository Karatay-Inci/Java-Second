package MARCH14CreatingClasses;

public class F5CostOfTheProduct {
    //Write a java method to calculate the Cost Of The Product
    public static void main(String[] args) {
        System.out.println(calculateCost(10.1,0.3));
        System.out.println(calculateCost(10.1,0.3,3.65));
    }

    public static double calculateCost(double price,double tax) {
        double totalPrice=(price+tax)*1.1;            // Or chose this-->   return (price + tax) * 1.1;
        return totalPrice;
    }

    public static double calculateCost(double price,double tax,double shipping) {
        double totalPrice=(price+tax)*1.1+ shipping;
        return totalPrice;                          // Or chose this-->   return (price + tax) * 1.1+ shipping;
    }
}
