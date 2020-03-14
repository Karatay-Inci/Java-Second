package FEB29Arrays;

public class D19PrintNumbersDivisibleBy4 {
    public static void main(String[] args) {
        int [][]numbers=D17TenByTenArray.generateArray(10);
        printDivisibleFour(numbers);

    }
    /*public static void printDivisibleFour(int [][]arr){
        for (int i=0;  i<arr.length;  i++){
            for (int j=0;  j<arr[i].length; j++){
                int num=arr[i][j];
                if (arr[i][j]%4==0){
                    System.out.println(num);

                }
            }
        }
    */             // Other solution


    public static void printDivisibleFour(int[][] arr){
        for(int[] row:arr){
           for(int number:row){
                if(number%4==0)
                    System.out.print("\t"+number);
                else
                    System.out.print("\t -");
            }
            System.out.println();
        }

    }
}