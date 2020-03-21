package FEB29Arrays;

public class D22SquareArray {
    public static void main(String[] args) {
        int[][] myArr = {{2,3},{3,4,5},{6,7,8}};
        System.out.println(isSquare(myArr));
        int[][] myArr2 = {{1,2,3},{3,4,5},{6,7,8}};
        System.out.println(isSquare(myArr2));

    }
    public static boolean isSquare(int[][] arr){
        boolean square=true;
        for (int i=0;  i<arr.length;  i++){
            if (arr.length!=arr[i].length){
                square=false;
            }
        }
        return square;
    }
}
