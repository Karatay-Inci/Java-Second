package FEB9;

public class B15CalendarWhileLoop {
    public static void main(String[] args) {

        int mounth= 1;
        int day;

        while (mounth<13){
               day=1;             //if we write this shape --->int day = 1;   or day=1;--->result= 12 months
            while (day<31){
                day++;
                System.out.println(mounth+"-"+day+"-"+"2020");
            }
            mounth ++;
        }
    }
}
