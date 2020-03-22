package MARCH11Review;

public class E8IntersectionNumbers {
    public static void main(String[] args) {
        int[] number1={1,2,3,4,5,6};
        int[] number2={3,4,6,8,9,55,59};
        printCommons(number1,number2);

    }
    public static void printCommons(int arr1[],int arr2[]){
        for (int i=0;  i<arr1.length;  i++){
            for (int j=0;  j<arr2.length;  j++){
                if (arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+",");
                }
            }
        }
    }
}
