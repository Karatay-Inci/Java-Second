package FEB26MethodsAndLibraries;
public class C34Restaurant {
    /*   OUESTION:      DESIGN A RESTAURANT MENU SYSTEM
     *First Display menu
     * Ask user preferences
     * Display receipt      */
    public static void main(String[] args) {
        showMenu();
    }
    public static void showMenu(){
        System.out.println("\t\tMenu\n---------------");
        System.out.println("SOUPS:\n.............."
                             +"\n*Lentil \t $3.99\n"+"*Tomato \t $4.99\n"+"*Fish \t\t $8.99\n");
        System.out.println("MEALS:\n.............."
                             +"\n*Rice \t\t $3.99\n"+"*Chicken \t $5.99\n"+"*Beef \t\t $7.99\n");
        System.out.println("SALADS:\n.............."
                              +"\n*Ceaser \t $2.99\n"+"*Waldorf \t $3.99\n");
    }
    public static void printReceipt(int soup,int meal,int salad){
        double total=0;
        System.out.println("\t\t----RECEIPT----");
        if (soup==1){
            System.out.println("Lentil : \t\t$3.99");
            total +=3.99;
        }
        else if (soup==2){
            System.out.println("Tomato : \t\t$4.99");
            total +=4.99;

        }
        else if (soup==3){
            System.out.println("Fish : \t\t$8.99");
            total +=8.99;

        }
        if (meal==1){
            System.out.println("Rice : \t\t\t$3.99");
            total +=3.99;

        }
        else if (meal==2){
            System.out.println("Chicken : \t\t$5.99");
            total +=5.99;

        }
        else   if (meal==3){
            System.out.println("Beef : \t" +
                    "\t\t$7.99");
            total +=7.99;

        }
        if (salad==1){
            System.out.println("Ceaser : \t\t$2.99");
            total +=2.99;

        }
        else{
            System.out.println(""+"Waldorf: \t\t3.99");
            total +=3.99;
        }
        System.out.println("__________________\n"+"" +
                "\t\t\t$"+total);
    }
}
