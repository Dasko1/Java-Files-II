package files;

import java.util.Scanner;

public class EnterName {

    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);                 // Create a Scanner object!
        System.out.print("Enter username: ");

        String userName = myObj.nextLine();                     // Read user input
        System.out.println("\nThe Username is: " + userName);   // Output user input
    }
}