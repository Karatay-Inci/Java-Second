package FEB29Arrays;

public class D5Exam5 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int[] b={2,4,6,8,10,12};
        boolean isTT=true;
        for (int i=0;   i<a.length;  i++){
            if(b[i]!=2*a[i]){
                isTT=false;
            }
        }
        if (isTT){
            System.out.println("OK");
        }
        else{
            System.out.println("Not Ok");
        }
    }
}
