package FEB9;

public class B16LoopNumbersWhile3 {
    public static void main(String[] args) {
        int number=1;
        int counter;
        for (int i = 1;   i<=3;   i++){
            counter =1;
            while(counter<6){
                System.out.print(number +"\t\t");
                counter++;
                number++;
            }
            System.out.println();

        }
    }
}
