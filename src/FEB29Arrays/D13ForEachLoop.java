package FEB29Arrays;

public class D13ForEachLoop {
    public static void main(String[] args) {
        int[] arrayInt=      {1,2,3,4,5,6,7,8,9};
        String []arrayString={"Hello","Java","It","is","good","to","see","you"};

        for (int number:arrayInt){
            System.out.println(number);
        }
        for (String word:arrayString){
            System.out.print(word);
        }
    }
}
