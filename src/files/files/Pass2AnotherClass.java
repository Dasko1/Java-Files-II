package files;

public class Pass2AnotherClass {
    public int x = 10;
}

// The class above does just one thing: it creates the integer 10.

class B {
    public static void main(String[] args) {
        // Create an instance of ClassA
        Pass2AnotherClass a = new Pass2AnotherClass();

        // Access the variable x from ClassA
        int y = a.x;

        // Print the value of y
        System.out.println("\nThe number from class Pass2AnotherClass is: " + y);
    }
}
