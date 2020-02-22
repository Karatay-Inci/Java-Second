package FEB9;
public class B16LoopLettersAndNumbersAlphabeWhile7 {
    public static void main(String[] args) {
        int number = 1;
        int count;
        char letter = 'a';

        while (number < 7) {           //----->condition
            System.out.print(number+"\t");
            count=0;

        while (count < 4) {            //burada letter yerine neden count yazildi      ????//how many letters ,i am gonna printl
                System.out.print(letter+"\t");
                count++;
                letter++;
         }
            System.out.println();
            number++;

        }
    }
}