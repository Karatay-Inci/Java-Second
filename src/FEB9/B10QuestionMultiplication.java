package FEB9;

public class B10QuestionMultiplication {
    public static void main(String[] args) {
        for(int i = 1;  i<11;   i++   ){      //if you want just 1 to 5-----> i<6
            for(int j=1;  j<=10;   j++) {
                System.out.println(i+"x" +  j + "=" + (i*j));
            }
            System.out.println("------------------------------");
        }
    }
}
