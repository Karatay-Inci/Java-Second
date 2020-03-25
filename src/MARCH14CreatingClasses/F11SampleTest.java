package MARCH14CreatingClasses;

public class F11SampleTest {
    public static void main(String[] args) {
        F11Sample s1 = new F11Sample();
        System.out.println("s1: "+s1.a);
        F11Sample s2 = new F11Sample();
        System.out.println("s2: "+s2.a);
        F11Sample s3 = new F11Sample(8,0);
        System.out.println("s3: "+s3.a);
        F11Sample s4 = new F11Sample(55,6);
        System.out.println("s4: "+s4.b);
        F11Sample s5 = new F11Sample(99);
        System.out.println("s5: "+s5.b);
    }
}
