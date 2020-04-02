package FEB29Arrays;

public class D26maxDifferenceQ {
    //For given 1 dim array find the max difference for the adjacent elements
    public static void main(String[] args) {
        int[] myNumbers = {2,5,7,8,20,10};
        printMaxDiff(myNumbers);
    }
    public static void printMaxDiff(int[]arr){
        int diffs[] = new int[arr.length];
        for (int i=1;  i<arr.length;  i++) {
            diffs[i]=Math.abs(arr[i]-arr[i-1]);
        }
        //Now it is time to find the max value of the 1 dimensional array
        int max=diffs[0];
        int i=0;
        int index=0;
        for (int number: diffs){
            if (number >max){
                max=number;
                index=i;
            }
            i++;
        }
        System.out.println("Max difference is:"+max+" and indexes are:" +index+" "+(index-1));
    }
}
