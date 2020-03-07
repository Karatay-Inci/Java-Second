package FEB26MethodsAndLibraries;

public class C29PasswordlettersNumbers {
    public static void main(String[] args) {
        int count=0;
        do {
            generatePss();
            System.out.println();
        count++;
        }while(count<5);
    }
    public static void generatePss(){
        // to generate random 3 letters
        for (int i=0;  i<3;  i++){

            System.out.print((char)(97+(int)(Math.random()*26)));
        }
        // to generate random 3 digit number
        for (int j=0;   j<3;   j++)
            System.out.print((int)(Math.random()*10));
    }
}
