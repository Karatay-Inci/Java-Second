package FEB29Arrays;

public class D23DisplayMinValue {
    // Write a method to display min value of each row in a 2=dimensional array
    public static void main(String[] args) {
        int[][] myArr = {{1,2,3},{4,5,6},{7,8,9}};
        printRowsMin(myArr);
    }
    public static int returnMin(int[] array){
        int min = array[0];
        for(int number:array){
            if (number<min){
                min = number;
            }
        }
        return min;
    }
    public static void printRowsMin(int arr[][]){
        int index=0;
        for(int[] row:arr){
            System.out.println("Min of row"+index+" "+returnMin(row));
            index++;
        }
    }
    public static int[] returnRowsMin(int[][]arr){
        int[] mins = new int[arr.length];
        int index=0;
        for(int []row : arr){
            mins[index] = returnMin(row);
        }
        return mins;
    }
}
