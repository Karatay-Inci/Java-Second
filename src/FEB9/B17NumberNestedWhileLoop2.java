package FEB9;

public class B17NumberNestedWhileLoop2 {
    public static void main(String[] args) {
        int tens=1;
        int ones;

        while(tens<10){
            ones=0;

            while(ones<10){
                System.out.print(tens);
                System.out.print(ones);
                System.out.println();

                ones++;
            }
            tens++;
        }
    }
}
