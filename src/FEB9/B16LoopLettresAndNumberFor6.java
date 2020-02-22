package FEB9;
public class B16LoopLettresAndNumberFor6 {
    public static void main(String[] args) {
        char letter = 'a';

        for (int i = 1; i < 6; i++) {
            System.out.print(i + "\t");

            for (int j = 1; j <=4; j++) {
                System.out.print(letter+"\t");
                letter++;
            }
            System.out.println();
        }
    }
}
