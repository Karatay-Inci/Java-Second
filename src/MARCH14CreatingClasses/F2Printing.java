package MARCH14CreatingClasses;

public class F2Printing {
    //Write a method to print any string and overload that method according to requirements ...
    public static void main(String[] args) {
        printString();
        printString("Java");
        printConfuse("I love Java",3);
    }
    public static void printString(){
        for (int i=0;  i<101;  i++){
            System.out.println("Hello World");
        }
        System.out.println();
    }
    public static void printString(String word) {
        for (int i = 0; i < 101; i++) {
            System.out.println(word);
        }
    }
    public static void printConfuse(String word,int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(word);
        }
    }
}
