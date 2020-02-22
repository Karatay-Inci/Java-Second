package FEB9;

public class B19VowelsOnly {
    public static void main(String[] args) {
        String myStr="Java is fun";
         for (int index=0;   index<11;    index++){        //OR      --->index<11;   =    index<myStr.length;

             if(myStr.charAt(index)=='a' || myStr.charAt(index)=='i'   ||   myStr.charAt(index)=='u'  ){
                 System.out.print(myStr.charAt(index));
             }
         }
    }
}
