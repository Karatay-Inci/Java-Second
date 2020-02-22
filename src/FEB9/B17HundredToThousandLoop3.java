package FEB9;

public class B17HundredToThousandLoop3 {
    public static void main(String[] args) {
        for (int i=1;   i<10;   i++){
            for (int j=0;   j<10;   j++){
                for (int k=0;   k<10;   k++){
                    System.out.println(""+i+j+k);
                }
            }
        }
    }
}
                    //      OR    //
/*
    int hundred=10;
    int tens;
        while(hundred<100){
            tens=0;
            while(tens<10){
                System.out.println(hundred+""+tens);
                tens++;

            }
            hundred++;
        }
    }
}
*/