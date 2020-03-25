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
        result+=this.value.charAt(0);
        result+=result.toUpperCase();
        String letter="";
        for (int i=1;  i<this.value.length();  i++){
            if (this.value.charAt(i-1)==' '){
//Check previous char if it is space first convert to String using concat and then conver to upper
                letter+= this.value.charAt(i);      //converting String
                letter+= letter.toUpperCase();      //converting upper
                result+=letter;                     //concat to result
                letter="";                          //reset for the second word
            }
            else{
                result +=this.value.charAt(i);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "F13StringOperation{" +
                "value='" + value + '\'' +
                '}';
    }
}
