package FEB29Arrays;

public class D21CitiesFirstLetterAA {
    public static void main(String[] args) {
        String [][] myCities = createRandomCities(4,3);
        System.out.println();
        printCitiesA(myCities);
        System.out.println();
        printCitiesReversed(myCities);
    }
    public static String [][] createRandomCities(int rows,int cols){
        String[] cities = {"Ann Arbor","Fort Worth","Fairfax","Orlando",
                "Denver","Portland","Phoneix","Arlington","Atlanta",
                "Amarillo","Boulder","Chicago","Albany"};

        String[][] randCities =new String[rows][cols];
        int index;
        for (int i=0;  i<randCities.length;  i++){
            for (int j=0;  j<randCities[i].length;  j++){
                randCities[i][j] = cities[(int)(Math.random()*cities.length)];
            }
        }
        return randCities;
    }
    public static void printCitiesA(String[][]cities){           //Question1= print cities with first letter is "A"
        for (String[] row:cities){
            for (String city:row){
                if (city.charAt(0)==65){
                    System.out.println(city);
                }
            }
        }
    }
    public static void printCitiesReversed(String[][] cities){      //Question2= print all city names reversed
        for (String[] row:cities){
            for (String city:row){
                System.out.println(reverseString(city));
            }
        }

    }
    public static String reverseString(String text){
        String reversed="";
        for (int i=text.length()-1;  i>=0;  i--){
            reversed = reversed + text.charAt(i);
        }
        return reversed;
    }
    public static void printAtoH(String[][] cities){            //Question3= print city names starts with between A to H
        for (String [] citiesRow:cities){
            for (String city:citiesRow){
                if (city.charAt(0)>='A'  && city.charAt(0)<='H'){
                    System.out.println(city);
                }
            }
        }
    }

}
