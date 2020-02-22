package FEB9;

public class B16LoopNumbersWhle3 {
    public static void main(String[] args) {
        int number=1;
        int counter;
        for (int i=1;  i<=3;   i++  ){
            counter=1;
            while(counter<6){
               if (number==7 || number==8  ||  number==9){         //OR if (number>5 && number<13 ){      OR   // if (number%2==0){
                    System.out.print(" "+ "\t\t");
                }
                else{
                    System.out.print(number+"\t\t");
                }
                counter++;
                number++;
            }
            System.out.println();
        }
    }
}
