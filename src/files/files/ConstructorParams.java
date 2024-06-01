package files;

public class ConstructorParams {

    int modelYear;
    String modelName;

    public ConstructorParams(int year, String name){
        modelYear = year;
        modelName = name;
    }


    public static void main(String[] args){

        ConstructorParams myCar = new ConstructorParams(1969, "Camaro");
        System.out.println("\nThe car is a " + myCar.modelName + " and the year is " + myCar.modelYear + "!");
    }
}

// Constructors initialize objects! It has the same name as the class and does not have a return.