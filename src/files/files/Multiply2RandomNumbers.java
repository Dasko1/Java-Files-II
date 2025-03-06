//Go to GetProd2RandNums.java to execute and return a product.
package files;

import java.util.Random;

public class Multiply2RandomNumbers {

    public int multiply2Nums(){         // This is called in l.9 of GetProd2RandNums.java; this is a method that generates the action!

        // Create instance of Random class!
        Random rand = new Random();

        int x = rand.nextInt(100);
        int y = rand.nextInt(100);

        System.out.println("x = " + x + "\ny = " + y);

        int product = x * y;

        return product;
    }
}
