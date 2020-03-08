package FEB29Arrays;

public class D2ArraysSum {
    public static void main(String[] args) {
        int[] myNumbers={1,234,3243,4545,5454,6767,89,20,3,98};
        int sum=0;
        for (int i=0;   i<myNumbers.length;  i++) {
            sum += myNumbers[i];
        }
        System.out.println(sum);
    }
}
