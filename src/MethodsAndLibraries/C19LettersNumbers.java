package MethodsAndLibraries;

public class C19LettersNumbers {

    public static void printLetters(){
        for (int i=1;  i<6;  i++){
            System.out.print(i);
            for (char letter='a';  letter<'e';   letter++){     //    OR    (char j=97;  j<'102;   j++)
                System.out.print("\t"+letter+"\t");
            }
            System.out.println();
        }
    }
}
