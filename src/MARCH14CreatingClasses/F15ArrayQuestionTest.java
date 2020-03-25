package MARCH14CreatingClasses;

import java.util.Arrays;

public class F15ArrayQuestionTest {
    public static void main(String[] args) {
        F15ArrayQuestion obj1 = new F15ArrayQuestion();
        int[] array1 = obj1.returnArray();
        System.out.println(Arrays.toString(array1));
        obj1.printOdds(array1);
        F15ArrayQuestion obj2 = new F15ArrayQuestion(30);
        int[] array2 = obj2.returnArray();
        System.out.println();
        System.out.println(Arrays.toString(array2));
        obj2.printOdds(array2);
    }
}