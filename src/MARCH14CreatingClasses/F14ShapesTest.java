package MARCH14CreatingClasses;

public class F14ShapesTest {
    public static void main(String[] args) {
        F14Shapes s1 = new F14Shapes();
        s1.printPyramid();
        F14Shapes s2 = new F14Shapes();
        s2.printPyramid(true);
        s2.printPyramid(false);
        F14Shapes s3 = new F14Shapes('#',20,30,true);
        s3.printPyramid();
        System.out.println();
        s3.printRectangle();
    }
}
