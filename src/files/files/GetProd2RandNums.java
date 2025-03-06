// Generates two numbers from Multiply2RandomNumbers.java, multiplies them together and prints the result!
package files;

public class GetProd2RandNums {

    public static void main(String[] args){

        Multiply2RandomNumbers newObj = new Multiply2RandomNumbers();       // newObj is an object variable
        int result = newObj.multiply2Nums();                                // multiply2Nums is the method from l.8 in Multiply2RandomNumbers.java
        System.out.println("\nThe product of the two random numbers is: " + result);

        System.out.println();
    }
}

// The action is run and output in this file: Multiply2RandomNumbers.java just calculates everything and sends
// it to this file from the return statement.