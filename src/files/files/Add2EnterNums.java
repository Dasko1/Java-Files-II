package files;

import java.util.Scanner;

public class Add2EnterNums extends Object{

    public static void main(String[] args){

        Scanner nums = new Scanner(System.in);                 // Create a Scanner object!

        System.out.print("Enter value for x: ");
        int x = nums.nextInt();
        System.out.print("Enter value for y: ");
        int y = nums.nextInt();

        int z = x + y;

        System.out.println("\nThe sum is: " + z);
    }

    public static int calculateSum(int x, int y) {
        return x + y;
    }
}
