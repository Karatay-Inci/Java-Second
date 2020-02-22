package FEB9;

public class B15CalendarForLoop {
    public static void main(String[] args) {

        for (int month = 1; month < 13; month++) {
            System.out.println("MONTH:" + month+ "\n__________");

            for (int day = 1; day <= 30; day++) {
                System.out.println(month + "/" + day + "/" + "2020 ");
            }
            if (month!=12) {    // 1!=12--->true  .....  11!=12---->true 12!=12----> false

                System.out.println("------------------");
            }
        }
    }
}