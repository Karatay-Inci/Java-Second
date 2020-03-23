package MARCH14CreatingClasses;

public class F8Car {
    int modelYear;
    double engineVolume;
    String modelName;
    public F8Car(int year, double engine, String model ){
        modelYear = year;
        engineVolume = engine;
        modelName = model;
    }
    public void startEngine(){
        System.out.println("Vrooom");
    }
}
