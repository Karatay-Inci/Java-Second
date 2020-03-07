package FEB26MethodsAndLibraries;

public class C13PasswordChaeck {
    /*
        Design a password checking program.
        *Length of the password cannot be shorter than 6 character
        *Sample     input : abcdef          output:Password is OK
        *Sample     input : abc             output:Password must be at least 6 character
    */
    public static void main(String[] args) {
        passCheck("12345");
        String check=passwordCheck("123456");
        System.out.println(check);
        System.out.println(isPasswordGood("password"));
        String password="1234567";
        if (isPasswordGood(password)){
            System.out.println("Length is OK");
        }

    }
    public static void passCheck(String password){
        if (password.length()<6){
            System.out.println("NOT OK");
        }
        else{
            System.out.println("OK");
        }
    }
    public static String passwordCheck(String password){
        String result;
        if(password.length()>=6){
            result="OK";
        }
        else{
            result="NOT OK";
        }
        return result;
    }
    public static boolean isPasswordGood(String password){
        boolean result;
        if (password.length()<6){
            result=false;
        }
        else{
            result=true;
        }
        return result;
    }
}
