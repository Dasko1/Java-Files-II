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


// The main method at l.17 outputs everthing defined in the method returnName. The intended output, the activity of the program is
// defined in the returnName method. The main method from ll.17-22 outputs what is calculated in the returnName method. In l.19, nameHere
// is defined as a new object variable of the EnterNameReturn class. This whole thing is a class: remember, the class is the object &
// the method is the verb. nameHere is an instance of the EnternameReturn class, so the object variable stores an instance of the
// EnterNameReturn class. In l.20, the String variable yourName gets the value of object variable instance nameHere plus the action
// defined in the returnName method from ll.7-15. Object (class) plus verb (method)! Line 21 just outputs the value of yourName.
// See Multiply2RandomNumbers.java & GetProd2RandNums.java for the same thing that happens in two different Java files! In other words,
// Multiply2RandomNumbers.java is the method, like returnName (l.7-15) is here, and GetProd2RandNums.java is the main method in ll.17-22.
