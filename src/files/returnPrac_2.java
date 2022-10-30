// returnPrac_2.java: what you want to return here is the answer when you add two decimal numbers and divide that by two.

package files;

public class returnPrac_2 {

    // Method 1
    // Since return type of RR method is double, this method should return a double value.
    double RR(double a, double b) {
        double sum = (a + b) / 2.0;

        // Return statement as we already have declared above; return type to be double
        return sum;
    }

    // Method 2 - Main driver method
    public static void main(String[] args)
    {
        returnPrac_2 A = new returnPrac_2();
        // Print statement
        System.out.println("\nAnswer: " + A.RR(5.8, 6.8));
    }
}
