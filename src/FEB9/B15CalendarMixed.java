package FEB9;

public class B15CalendarMixed {
    public static void main(String[] args) {

        //while and for implementation

        int month=1;
        while (month<13){
            for (int day=1;     day<=30;    day++){
                System.out.println(month+"/"+day+"/"+"2020");
            }
            month++;
        }
        System.out.println();

        //for and while
        int daywhile;
        for (int monthFor=1; monthFor<13;  monthFor++){
        daywhile=1;
        while (daywhile<=30){
            System.out.println(monthFor+"-"+daywhile+"-"+"2020");
            daywhile++;
             }
        }
    }
}
