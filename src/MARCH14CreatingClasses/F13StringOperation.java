package MARCH14CreatingClasses;

public class F13StringOperation {
    String value;
    public F13StringOperation(){
        this.value="";
    }
    public F13StringOperation(String value){
        this.value=value;
    }
    public String returnReversed(){
        String result="";
        for(int i=this.value.length()-1;  i>=0;  i--){
            result += this.value.charAt(i);
        }
        return result;
    }
    public String returnCapitalized(){
//first concat first letter and convert that letter to upper
        String result ="";
        String firstLetter="";                  //this variable for converting to String
        firstLetter+=this.value.charAt(0);      //concat first letter with first char
        //System.out.println(result);
        result+=result.toUpperCase();           //concat first letter (upper case) and result
       // System.out.println(result);
        String letter="";
        for (int i=1;  i<this.value.length();  i++){
            if (this.value.charAt(i-1)==' '){
//Check previous char if it is space first convert to String using concat and then conver to upper
                letter+= this.value.charAt(i);      //converting String
                letter= letter.toUpperCase();      //converting upper
                result+=letter;                     //concat to result
                letter="";                          //reset for the second word
            }
            else{
                result +=this.value.charAt(i);
            }
        }
        return result;
    }
    public String [] returnString(){
        String[] result = new String[this.value.length()];
        String letter;
        for (int i=0;  i<this.value.length();  i++){
            letter = ""+ this.value.charAt(i);
            result[i]=letter;
            letter="";
        }
        return result;
    }
    public String[] returnSentence(){
        this.value+=" ";
        int numberOfSpaces=0;
        for(int i=0;  i<this.value.length();  i++){
            if(this.value.charAt(i)==' '){
                numberOfSpaces++;
            }
        }
        String words[] = new String[numberOfSpaces];
        String word="";
        int index =0;
        for (int i=0;  i<this.value.length();  i++){
            if (this.value.charAt(i)!=' '){
                word+=this.value.charAt(i);
            }
            else{
                if(index<numberOfSpaces-2){
                words[index]=word;
                index++;
                word="";
                    System.out.println(index);
                }
            }
        }
        return words;
    }



    @Override
    public String toString() {
        return "F13StringOperation{" +
                "value='" + value + '\'' +
                '}';
    }
}
