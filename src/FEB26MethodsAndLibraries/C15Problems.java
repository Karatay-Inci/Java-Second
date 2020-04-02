package FEB26MethodsAndLibraries;

public class C15Problems {
    /*      *Print all whole numbers between 100-1000(both included)
            *Print all ASCII numbers and Characters
            * Print all lowercase letters
            * Print all uppercase letters                                */

    //Method to print from 100 to 1000
    public static void printNum(){
        int start=100;
        while (start<=1000){
            System.out.println(start);
            start++;
        }
    }
    //Method print all ASCII values and CHARS

    public static void printASCIIALL(){
        for(int i=0;   i<256;    i++){
            System.out.println("Number :"+i+" "+"Character :"+(char)i);
        }
    }
    public static void printLowercase(){
        for (int i=97;   i<123;   i++){
            System.out.println(" "+i+"  ="+(char)i);
        }
    }
    public static void printUppercase(){
        for (int i=65;   i<91;  i++){
            System.out.println(" "+i+"  = "+(char)i);
        }
    }
}
