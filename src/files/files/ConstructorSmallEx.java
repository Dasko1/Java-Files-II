package files;

public class ConstructorSmallEx {
    int x;                              // This is the class attribute.

    // Create a class constructor for the Main class
    public ConstructorSmallEx(){
        x = 5;                          // Set the initial value for the class attribute x.
    }


    public static void main(String[] args){

        ConstructorSmallEx obj = new ConstructorSmallEx();      // Create an object of class ConstructorSmallEx (This will call the constructor)
        System.out.println(obj.x);                              // This prints out the object of the contructor.
    }
}

/*A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object
of a class is created. It can be used to set initial values for object attributes.*/