package MARCH11Review;

public class E6Duplicate {
    //Find duplicate values in the String Array

    public static void main(String[] args) {
        
        String myArr[]={"abc","def","abc","ddd","def"};
        printDuplicates(myArr);
    }
    public static void printDuplicates(String []arr){
        for (int i = 0;  i<arr.length;  i++){

            for (int j=i;  j<arr.length;  j++){           //   j=i+1
                                                          //   OR
                if (arr[j].equals(arr[i])  && i!=j){      //   i!=j

                    System.out.println(arr[i]);
                }
            }
        }
    }
}
