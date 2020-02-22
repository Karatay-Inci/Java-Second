package FEB9;

public class B19VowelsOnlyWhile {
    public static void main(String[] args) {
        String sentence = "Sunday is fun day";
        int index=0;
        while (index<sentence.length()){
            if ((sentence.charAt(index)=='u'  ||  sentence.charAt(index)=='a'  ||  sentence.charAt(index)=='i' )){
                System.out.print(sentence.charAt(index));
            }
            index++;
        }
    }
}
