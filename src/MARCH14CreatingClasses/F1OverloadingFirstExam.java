package MARCH14CreatingClasses;

public class F1OverloadingFirstExam {
    public static void main(String[] args) {
        printThis();
        printThis("Java World");

    }
    public static void printThis(){

        System.out.println("Hello");
    }
    public static void printThis(String word){

        System.out.println(word);
    }
}
