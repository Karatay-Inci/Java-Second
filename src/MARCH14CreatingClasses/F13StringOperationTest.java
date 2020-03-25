package MARCH14CreatingClasses;
import java.util.Arrays;

public class F13StringOperationTest {
    public static void main(String[] args) {
        F13StringOperation myStr = new F13StringOperation("java is super fun");
        System.out.println(myStr.returnReversed());
        System.out.println(myStr.returnCapitalized());
        System.out.println(Arrays.toString(myStr.returnString()));
        System.out.println(Arrays.toString(myStr.returnSentence()));

    }
}
