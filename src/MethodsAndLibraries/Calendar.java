package MethodsAndLibraries;

public class Calendar {
    public static void printCalendar(int year) {
        for (int i=1;  i<13;  i++){
            for (int j=1;  j<31;  j++){
                System.out.println(i+"/"+j+"/"+year);
            }
        }

    }
}
