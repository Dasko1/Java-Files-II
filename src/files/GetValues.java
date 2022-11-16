// GetValues.java: execute this from SampleRun.java
package files;

import java.util.Scanner;

public class GetValues {

    private static final Scanner input = new Scanner(System.in);
    private static String z = "";

    public static void wew() {
        System.out.print("Enter Name: ");
        z = input.nextLine();
    }

    public static String kuhaName() {
        return z;
    }
}
