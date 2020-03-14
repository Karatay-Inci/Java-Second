package FEB29Arrays;

public class D17TenByTenArray {
    //Create an int 10x10 array and put values from 1 to 100
    public static void main(String[] args) {
        int[][] myNumbers=generateArray(10);
        printArrayElements(myNumbers);
    }
    public static int[][] generateArray(int arraySize){
        int counter=1;
        int[][] arr=new int [arraySize][arraySize];
        for (int i=0;  i<arr.length;  i++){
            for (int j=0;   j<arr[i].length;  j++){
                arr[i][j]=counter;
                counter++;
            }
        }
        return arr;
    }
    public static void printArrayElements(int[][] arr){
        for (int[] numberArray:arr){                     //outer
            for(int number:numberArray){                //inner
                System.out.format("%5d",number);
            }
            System.out.println();
        }
    }
}
