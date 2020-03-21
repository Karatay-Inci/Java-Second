package MARCH11Review;

public class E5Arrays {
    public static void main(String[] args) {
        //How to initialize array?  ("a" take a new value)
        int[] a= {1,2,3};
        a [0]=9;
        System.out.println(a[0]);


        int[] arr1=new int[5];
        int[] arr2=new int[50];
        arr1=arr2;
        System.out.println(arr1.length);   //new assign for aar1

    }
}
