package FEB26MethodsAndLibraries;

public class C7PrinthingsASCIIValues {
    public static void listASCII() {
        for (int i=0;  i<256;  i++){
            System.out.print(( char ) i );
        }
    }
    public static void main(String[] args) {
        listASCII();
        listASCII();
    }
}
