package FEB29Arrays;

public class D10MaxValue {
    public static void main(String[] args) {
        int arrayNumbers[]={4,1,2,3};
        System.out.println(findMax(arrayNumbers));

    }

     static int findMax(int []arr) {
      int max=arr[0];
        for (int i =1; i < arr.length; i++) {
            if (arr[i]>max){
               max=arr[i] ;
            }
        }
        return max;
    }
}
