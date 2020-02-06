package secondpackage;

public class A20Widening {
    public static void main(String[] args) {
        byte number1= 99;
        int number2 = number1;
        int number3 = 6130;
        number1 = (byte) number3;
        System.out.println(number1);
    }
}
/*
write down
128---->    -128
55----->      55
6130---->    -14
127----->    127

 */