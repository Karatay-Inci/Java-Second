package FEB29Arrays;

public class D25PasswordGeneration {
    //Create random passwords according to rules below:
    //Create 2D String Array with elements below
    //3 UPPER CASE(index0) +  3 LOWER CASE(index 1)  + 1 SPECIAL CHAR(index 2)  + 4 NUMBERS(index 3)

    public static void main(String[] args) {
        for (int i=0;  i<10;  i++) {
            System.out.println(generatePassword());
        }
    }
    public static String generatePassword(){
        String[][] pass={{"A","B","C","D","E","F","G"},
                         {"a","b","c","d","e","f","g"},
                         {"@", "#", "-" ,"+", "_", "*", "&", "^", "$", "~" ,".", "|"},
                         {"1","2","3","4","5","6"}};

            String password="";
            int index;
            for (int i=0;  i<3;  i++){
                index=(int)(Math.random()*pass[0].length);
                password+=pass[0][index];
            }
            for (int i=0;  i<3;  i++){
                index=(int)(Math.random()*pass[1].length);
                password+=pass[1][index];
            }
             //for (int i=0;  i<1;  i++) {
                 index = (int) (Math.random() * pass[2].length);
                 password += pass[2][index];
             // }
            for (int i=0;  i<4;  i++){
                 index=(int)(Math.random()*pass[3].length);
                 password+=pass[3][index];
            }
                return password;
    }
}
