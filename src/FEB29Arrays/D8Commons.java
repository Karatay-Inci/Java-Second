package FEB29Arrays;

public class D8Commons {
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5,6};
        int[] array2={4,3,4,4,6,8,9,55,59};
        findCommons(array1,array2);
    }
     static void findCommons(int a[],int b[]){
         for (int i=0;  i<a.length;  i++){
             int counter=0;
             for (int j=0;  j<b.length;  j++){
                 if (a[i]==b[j]){
                     counter++;
                 }
             }
             if (counter>0){
                 System.out.println(a[i]);
             }
         }
    }
}
