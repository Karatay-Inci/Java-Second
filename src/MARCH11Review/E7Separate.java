package MARCH11Review;

import java.util.Arrays;

public class E7Separate {
    //Write a method to separate zeros and non zeros for given integer array
    //Sample input={0,5,4,2,1,0}    output={5,4,2,1,0,0}
    public static void main(String[] args) {

       int[] myArr={0,5,4,2,1,0};

       int[] result=separateZeros(myArr);

        System.out.println(Arrays.toString(result));
    }
    public static int[] separateZeros(int[] arr){

        int[] separated=new int[arr.length];

        int index=0;

        for (int i=0;  i<arr.length;  i++){

            if (arr[i]!=0){
                separated[index]=arr[i];
                index++;
            }
        }
        return separated;
    }
}
