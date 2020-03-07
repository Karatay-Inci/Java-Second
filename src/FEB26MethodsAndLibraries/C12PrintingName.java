package FEB26MethodsAndLibraries;

public class C12PrintingName {
    /*        Print your name in the main
            1.Write a void method to write your name (without parameter)
            2.Write a void method to write your name (with parameter)
            3.Write a String method to write your name (without parameter)
            4.Write a String method to write your name (with parameter)
    */
    public static void main(String[] args) {
        System.out.println("Sunday is fun day with Java");
        printMyName1();
        printMyName2("It is always fun with Java");
        System.out.println(printMyName3());
        System.out.println(peintMyName4("So you are also in love with Java"));

    }
    public static void printMyName1(){
        System.out.println("Yes sure");
    }
    public static void printMyName2(String name){
        System.out.println(name);
    }
    public static String printMyName3(){
        return "O yeah I love Java too";
    }
    public static String peintMyName4(String name){
        return name;
    }
}
