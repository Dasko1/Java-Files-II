// Getters & Setters: The getter method returns the value of the attribute.
// The setter method takes a parameter and assigns it to the attribute.
package files;

public class Vehicle {
    private String color;

    // Getter
    public String getColor(){
        return color;
    }

    // Setter
    public void setColor(String c){
        this.color = c;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.setColor("Red");
        System.out.println("\nThe vehicle color is: " + v1.getColor());
    }
}

// Note that the attribute is defined in l.6, the getter returns the value of the attribute, in this case, color.
// The setter then takes a parameter value & assigns it to the attribute defined in the getter.
// Once the getter and setter have been defined, we use it in the main. Note that here you create an object variable based
// on the Vehicle class called v1, then use the setter to set the color and print it out!  Think of it this way: there is a
// class called Vehicle.  Vehicle has a getColor method that returns a color (return breaks the getter flow). You then create
// a new class variable of Vehicle, v1 here, and use setter to give the car the specific color.
