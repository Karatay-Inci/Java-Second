package secondpackage;

public class A00assignment {
    public static void main(String[] args) {
        float my123 = 2.49f;
        float my124 = 4.79f;
        float my125 = 1.65f;
        float my126 = 7.88f;
        float my127 = 0.99f;
        System.out.format("\t\t Item id \t\t quantity \t\t price \n");
        System.out.format("\t \t----------------------------------\n");
        System.out.format("\t\tmy123 \t1\t  $%.2f\n", my123);
        System.out.format("\t\tmy125 \t2\t  $%.2f\n", 2*my125);
        System.out.println("\t\tTOTAL\t3\t  $" + (my123+2*my125));

    }
}
