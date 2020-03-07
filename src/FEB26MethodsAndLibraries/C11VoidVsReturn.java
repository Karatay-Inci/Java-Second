package FEB26MethodsAndLibraries;

public class C11VoidVsReturn {
     public static void methodA(){
        int a;
        int b=40;
        a=b;
         System.out.println(a);
    }
    public static int methodB(){
        int a;
        int b=40;
        a=b;
        return a;
    }

    public static void main(String[] args) {
        methodA();
        int a=methodB();
        System.out.println(a);

    }
}
