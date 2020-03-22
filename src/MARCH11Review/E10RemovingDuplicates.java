package MARCH11Review;

import java.util.Arrays;

public class E10RemovingDuplicates {
    //Write a java method to remove duplicate numbers in an integer array
    //Sample input={1,2,3,4,5,4,5}    output={1,2,3,4,5,0,0}
    public static void main(String[] args) {
        int myArray[] = {1,1,2,2,3,3,4,4,5,5,6,7,6,7};
        System.out.println(Arrays.toString(removeDuplicates(myArray)));
    }
    public static boolean isItInArray(int value, int[] arr) {
        boolean result = false;
        for (int number : arr) {
            if (number == value) {
                result = true;
            }
        }
            return result;
    }
    public static int[] removeDuplicates(int[] arr){
        int[] removeDup=new int[arr.length];
        for (int i=0;  i<arr.length;  i++){
            if(!isItInArray(arr[i],removeDup)){
                removeDup[i]=arr[i];
            }
        }
        return removeDup;
    }
}
