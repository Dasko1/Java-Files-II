// See also ArrayRandomDayPick.java & DayRandom.java for additional arrays!
package files;

public class ArrayEasy {

    public String carArray(){

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        String car = cars[2];                   // You have to create a String variable for the item selected from the array.

        return car;
    }


    public static void main(String[] args){

        ArrayEasy carpick = new ArrayEasy();
        System.out.println("\nThe car selected is: " + carpick.carArray());
    }
}
