package FEB29Arrays;

public class D19PrintSumOfAllColumns {
    public static void main(String[] args) {
        int[][] numbers=D17TenByTenArray.generateArray(10);
        printColumnsSums(numbers);
    }
    public static void printColumnsSums(int[][]arr){
        for (int i=0;  i<arr.length;  i++){
            int sum=0;
            for (int j=0;  j<arr[i].length; j++){
                sum = sum+arr[j][i];
            }
            System.out.println("Sum of columns"+i+":"+sum);
        }
    }
}
