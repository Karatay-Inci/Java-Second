package FEB9;

public class B21WhileTriangleStar {
    public static void main(String[] args) {
        int i=0;
        int j;
        while(i<20){
            j=0;
            while(j<=i) {
            System.out.print(" * ");
            j++;
        }
        System.out.println();
        i++;
    }
  }
}