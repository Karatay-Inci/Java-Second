package FEB9;

public class B22OppositeTriangleStar {
    public static void main(String[] args) {
        for (int i= 1;  i<10;   i++){
            for (int j=i;  j<10;  j++){
                System.out.print("\t");
            }
                for (int k=10;  k>10-i;   k--){
                    System.out.print("*   ");
                }
            System.out.println();
        }
    }
}
