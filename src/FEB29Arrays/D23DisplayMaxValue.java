package FEB29Arrays;

public class D23DisplayMaxValue {
    // Write a method to display max value of each row in a 2=dimensional array
    // Write a method to display min value of each row in a 2=dimensional array
    // Write a method to display max difference of each row in a 2=dimensional array
    public static void main(String[] args) {
        int[][] myArr = {{1,2,3},{4,5,6},{7,8,9}};
       // printRowsMax(myArr);
        int[] maxNumbers = returnRowsMax(myArr);
       /* System.out.println();

        for(int number:maxNumbers){
            System.out.println(number);
        }*/
        printRowsMin(myArr);
        printMaxDifference(myArr);
    }
    public static int returnMax(int[] array){
        int max = array[0];
        for(int number:array){
            if(number>max){
                max=number;
            }
        }
        return max;
    }
    public static void printRowsMax(int[][] arr){
        for(int[] row : arr){
            System.out.println(returnMax(row));
        }
    }
    public static int[] returnRowsMax(int[][] arr){
        int maxes[] = new int[arr.length];
        int index=0;
        for(int row[] : arr){
            maxes[index]=returnMax(row);
            index++;
        }
        return maxes;
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
    public static void printMaxDifference(int[][]arr){
        for (int i=0;  i<arr.length;  i++){
            System.out.println(returnMax(arr[i])-returnMin(arr[i]));
        }
    }
    public static int[] returnMaxDifferences(int[][]arr){
        int[] maxDiffs=new int[arr.length];
        for (int i=0;  i<arr.length;  i++){
            maxDiffs[i]=returnMax(arr[i])-returnMin(arr[i]);
        }
        return maxDiffs;
    }
}
