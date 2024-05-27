package files;

import java.util.Scanner;

public class EnterNameReturn {

    public String returnName(){

        Scanner myObj = new Scanner(System.in);                                 // Create a Scanner object!
        System.out.print("Enter username: ");                                   // Code the app from ll.9-12

        String userName = myObj.nextLine();                                     // Read user input

        return userName;                                                        // "return" breaks the flow of the method
    }

    public static void main(String[] args){

        EnterNameReturn nameHere = new EnterNameReturn();                       // Create a new instance of EnterNameReturn.class each time you execute this file
        String yourName = nameHere.returnName();                                // This works the same here or in a different Java class
        System.out.println("\nThe Username is: " + yourName + "!");             // Output user input
    }
}
