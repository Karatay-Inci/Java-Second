package FEB9;

public class B16LoopLettersAndNumbers4 {
    public static void main(String[] args) {
        for (int i=1;  i<=5;  i++){
            System.out.print(i);
            for(char letter ='a';  letter<'e';   letter++){            //OR letter='e';----->same result
                System.out.print("\t"+letter+"\t");
            }
            System.out.println();
            }
        }
    }

