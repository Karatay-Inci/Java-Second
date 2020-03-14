package FEB29Arrays;

public class D14ForEachLoopRandom {
    public static void main(String[] args) {
       int[] arrayNumbers=new int[10];
        for (int i=0;  i<arrayNumbers.length;  i++){
            arrayNumbers[i]=(int)(Math.random()*100);
        }
        for(int number:arrayNumbers){
        System.out.println(number);
        }
    }
}