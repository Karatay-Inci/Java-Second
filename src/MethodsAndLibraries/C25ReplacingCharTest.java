package MethodsAndLibraries;

public class C25ReplacingCharTest {
    public static void main(String[] args) {
        C25ReplacingChar.replaceChar("We love Java",'a','o');

        String newString = C25ReplacingChar.replaceCharStr("Hello",'o','a');
        System.out.println("\n"+newString);
    }

}
