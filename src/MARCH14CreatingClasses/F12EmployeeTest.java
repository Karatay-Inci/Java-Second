package MARCH14CreatingClasses;

public class F12EmployeeTest {
    public static void main(String[] args) {
        F12Employee Melih = new F12Employee(999,"Melih","QA",129000,"full time");
        System.out.println(Melih.calculateWeeklyPayment());
        System.out.println(Melih.calculateBiWeeklyPayment());
        System.out.println(Melih.toString());
        F12Employee fethat = new F12Employee(888,"Ferhat","IT",130000,"full time");
        System.out.println(fethat.toString());

    }

}
