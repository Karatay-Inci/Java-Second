package MethodsAndLibraries;

public class C25ReplacingChar {
    public static void replaceChar(String text,char toBeReplaced,char toReplace){
        for (int i=0;  i<text.length();  i++){
            if (text.charAt(i)==toBeReplaced){
            System.out.print(toReplace);
        }
        else{
            System.out.print(text.charAt(i));
           }
        }
    }
    public static String replaceCharStr(String text,char lookup,char newChar){
        String replaced="";
        for(int i=0;  i<text.length();  i++){
            if (text.charAt(i)==lookup){
                replaced+=newChar;
            }
            else {
                replaced+=text.charAt(i);

            }
        }
        return replaced;
    }
}
