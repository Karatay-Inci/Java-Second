package MethodsAndLibraries;

public class C18NumbersPrinting {
    public static void printNums (){
        int number = 1;
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(number + "\t");

                number++;
            }
                System.out.println();
        }
    }
}