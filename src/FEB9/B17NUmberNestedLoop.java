package FEB9;

public class B17NUmberNestedLoop {
    public static void main(String[] args) {

        for (int i=1;   i<=9;   i++){
            for (int j=0;  j<10;   j++){
                System.out.print(i);             //OR               // System.out.print(i); ---->erase
                System.out.print(j);                              // System.out.print(j);---->erase
                System.out.println();                            //--write-->         // System.out.println(i+""+j);




            }
        }
    }
}