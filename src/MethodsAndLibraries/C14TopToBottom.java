package MethodsAndLibraries;

public class C14TopToBottom {
    /*
    Write a program to write any String from top to bottom
        *Sample input: Hello
        *Sample output:
     */
    public static void main(String[] args) {
        topToBottom("Hello");

    }
    public static void topToBottom(String a){
        for (int i=0;  i<a.length();  i++){
            System.out.println(a.charAt(i));
        }
    }
}
