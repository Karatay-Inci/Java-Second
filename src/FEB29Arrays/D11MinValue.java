package FEB29Arrays;

public class D11MinValue {
    public static void main(String[] args) {
    int arrayNumbers[]={-4,-1,2,3};
        System.out.println(findMin(arrayNumbers));

    }

     static int findMin(int []arr) {
      int min=arr[0];
        for (int i =0; i < arr.length; i++) {
            if (arr[i]<min){
               min=arr[i] ;
            }
        }
        return min;
    }
}
