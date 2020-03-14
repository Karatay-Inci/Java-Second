package FEB29Arrays;

public class D12Symmetric {
    public static void main(String[] args) {
        int []myArr={1,2,3,2,1};
            symmetricPalindrome(myArr);
    }
    public static void symmetricPalindrome(int []arr) {
        int x = arr.length - 1;
        int  counter=0;
        for (int i = 0; i < arr.length/2; i++) {      //OR        i<arr.length
            if (arr[i] != arr[x]) {
            counter++;
        }
            x--;
            System.out.println("index"+x);

            }
        System.out.println("Counter"+counter);
                if (counter==0){
            System.out.println("Array is Symmetric");
                }
                    else{
            System.out.println("Array is not Symmetric");
                    }
    }
}
