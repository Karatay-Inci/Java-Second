package FEB29Arrays;

public class D7RandomIntegerArray {
    public static void main(String[] args) {
        createArrayWithRandomd(20);
    }

    public static void createArrayWithRandomd(int n){
        int arr[] = new int[n];
        for (int i=0;  i<arr.length;  i++) {
            arr[i] = 1000 + (int) (Math.random() * 4000);
        }
    //just to see the array elements
        for (int i=0;  i<arr.length;  i++) {
            System.out.println(arr[i]);
        }
    }
}
