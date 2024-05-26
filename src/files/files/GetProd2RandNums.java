package files;

public class GetProd2RandNums {

    public static void main(String[] args){

        Multiply2RandomNumbers newObj = new Multiply2RandomNumbers();
        int product = newObj.multiply2Nums();
        System.out.println("The product of the two random numbers is: " + product);

        System.out.println();
    }
}
