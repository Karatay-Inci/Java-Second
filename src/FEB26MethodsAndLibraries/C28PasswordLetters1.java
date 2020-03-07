package FEB26MethodsAndLibraries;

public class C28PasswordLetters1 {
    public static void main(String[] args) {
        generateletterPass(6);
        System.out.println();
        System.out.println(generateLettersPass(10));

    }
    public static void generateletterPass(int passLen){
        for (int i=0;  i<passLen;  i++){
            System.out.print((char)(97+(int)(Math.random()*26)));
        }
    }
    public static String generateLettersPass(int passLength){
        String result ="";
        for (int i=0;   i<passLength;  i++){
            result = result + (char)(97 + (int)(Math.random()*26));
        }
        return result;
    }

}
