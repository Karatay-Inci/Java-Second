package FEB29Arrays;

import java.awt.image.SampleModel;

public class D24ArrayTransposeQ {
    // Write a method returns 2D array columns as rows as columns
    //Sample:    -->     Output:
    // 1  2               1  3
    // 3  4               2  4
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[][] result= transposeArray(arr);
        for (int row[]:result){
            for (int number:row){
                System.out.print("\t"+number);
            }
            System.out.println();
        }
    }
    public static int[][] transposeArray(int[][] numbers){
        int[][] transposed=new int[numbers.length][numbers[0].length];      //  [0]??????????????????
        for (int i=0;  i<numbers.length;  i++){
            for (int j=0;  j<numbers[i].length;  j++) {
                transposed[j][i] = numbers[i][j];
            }
        }
        return transposed;
    }
}
