package MethodsAndLibraries;

public class C30Invoices {
    public static void main(String[] args) {
        System.out.println(decideElectriBill(5500));
        System.out.println(evaluateInternet(300));
    }
    public static String decideElectriBill(int consumption){
        String decision;
        if (consumption>=500 && consumption<=1000){
            decision="Good job";
        }
        else if (consumption>1000 && consumption<=1500){
            decision="Not bad";
        }
        else if (consumption>1500){
            decision="Start Saving Energy";
        }
        else{
            decision="Consumption is wrong";
        }
        return decision;
    }
    public static String evaluateInternet(int speed){
        String conclusion;
        if (speed>300){
            conclusion="Super Speed";
        }
        else if (speed>100){
            conclusion="Good speed";
        }
        else {
            conclusion="Unknown speed";
        }
        return conclusion;
    }
}
