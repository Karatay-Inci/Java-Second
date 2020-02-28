package FEB9;

public class B23TrianglePatternStars {
    public static void main(String[] args) {
        for (int i=0;   i<10;  i++){

            //for Loop for the spaces
            for (int j=0;   j<10-i;   j++){
                System.out.print("-");
            }
            //for Loop for stars
            for (int k=0;  k<2*i-1;  k++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
