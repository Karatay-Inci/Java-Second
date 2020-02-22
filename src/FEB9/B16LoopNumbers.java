package FEB9;

public class B16LoopNumbers {
    public static void main(String[] args) {
        //1 2 3 4 5 and repeat version for loop implementation
        int number=1;

        for (int i=1; i<5;  i++  ){            //---->It determines how many LINES it is..

            for (int j=1;   j<7;    j++) {       //---->COLUMNS
//if (number <43){
                System.out.print(number + "\t");
//               }
              number ++;
            }
            System.out.println();
        }
    }
}
