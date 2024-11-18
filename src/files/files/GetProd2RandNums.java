// Generates two numbers from Multiply2RandomNumbers.java, multiplies them together and prints the result!
package files;

public class GetProd2RandNums {

    public static void main(String[] args){

        Multiply2RandomNumbers newObj = new Multiply2RandomNumbers();
        int product = newObj.multiply2Nums();
        System.out.println("\nThe product of the two random numbers is: " + product);

        System.out.println();
    }
}
