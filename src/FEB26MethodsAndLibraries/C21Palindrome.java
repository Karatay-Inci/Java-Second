package FEB26MethodsAndLibraries;

public class C21Palindrome {
    public static boolean isPalindrome(String text){

        boolean result=true;
        int end=text.length()-1;
        for (int i=0;   i<end;  i++){
            if(text.charAt(i)!=text.charAt(end)){
                result=false;
            }
            end--;
        }
        return result;
    }
}
