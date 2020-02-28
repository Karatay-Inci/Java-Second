package MethodsAndLibraries;

public class C10PyramidDisplay {
    public static void pyramid(int numberOfLines){
        for (int i=1;   i<numberOfLines;  i++){
            for (int j=1;   j<=i;   j++){
                System.out.print(" * ");
            }
            System.out.println();

            }
        }

    public static void main(String[] args) {
        pyramid(5);
        pyramid(10);
        pyramid(15);
    }
}

