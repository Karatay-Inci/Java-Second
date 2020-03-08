package FEB29Arrays;

public class D5Exam2 {
    public static void main(String[] args) {
        a(b(c(2)));
    }
    static void a(int a){
        System.out.println(a);
    }
    static int b(int a){
        return a*2;
    }
    static char c(int b){
        char d='a';
        d+=b;
        return d;
    }
}
