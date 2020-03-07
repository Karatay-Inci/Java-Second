package FEB26MethodsAndLibraries;

public class C20Reversing {

    public static void reversingString(String sentence){
        for (int i=sentence.length()-1;   i>=0;   i--){
            System.out.print(sentence.charAt(i));
        }
    }
    public static String reverseText(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result = result + text.charAt(i);
        }
        return result;
    }


    public static void  sayPalindrome(String word) {
        String reverseWord  = reverseText(word);
        if(reverseWord.equals(word)){
            System.out.println("Madam is palindrome");
        }
        else{
            System.out.println("Test is not palindrome");
        }
    }
}
