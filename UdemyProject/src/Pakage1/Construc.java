package Pakage1;

public class Construc {
    int modelYear;
    String modelName;

    // make a constructor
    public Construc(int year, String name) {
        modelYear = year;
        modelName = name;
    }


    public static void main(String[] args) {

        Construc myCar = new Construc(1969, "Bmw");
        System.out.println("The car build in " + "" + myCar.modelYear + " ,and the car model is " + "" + myCar.modelName);

    }
}
