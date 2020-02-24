package FEB9;

public class B21WhileUpSideDownTriangle {
    public static void main(String[] args) {
    int i=0;
    int j;

    while (i<16){
        j=16;

    while(j>i){
            System.out.print(" * ");
         j--;
        }
            System.out.println();
        i++;
    }
  }
}
