package FEB1secondpackage9;

public class A29StringCompare2 {
    public static void main(String[] args) {
        String str5 = "a";
        String str6= "a";
        System.out.println(str5.compareTo(str6));
        System.out.println(str6.compareTo(str5));


        String str1 = "a";                               //a = 97           (from character list)
        String str2 = "b";                               //b = 98
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str1));


        String str3 = "a";                                 //a = 97
        String str4 = "c";                                  //b = 99
        System.out.println(str3.compareTo(str4));
        System.out.println(str4.compareTo(str3));
    }
}
