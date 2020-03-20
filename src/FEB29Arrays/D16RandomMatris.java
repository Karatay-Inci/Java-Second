package FEB29Arrays;

public class D16RandomMatris {
    public static void main(String[] args) {
        int arrayNumbers[][] = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
        for (int i = 0; i < arrayNumbers.length; i++) {
                for (int j = 0; j < arrayNumbers[i].length; j++) {
                    arrayNumbers[i][j] = (int) (Math.random() * 10);
                }
        }
        for (int numberArray[]:arrayNumbers) {
                for (int number:numberArray) {
                    System.out.print(number+"\t");
                }
            System.out.println();
        }
    }
}
