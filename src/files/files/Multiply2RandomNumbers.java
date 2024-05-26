package files;

import java.util.Random;

public class Multiply2RandomNumbers {

    public int multiply2Nums(){

        // Create instance of Random class!
        Random rand = new Random();

        int x = rand.nextInt(100);
        int y = rand.nextInt(100);

        System.out.println("x = " + x + "\ny = " + y);

        int product = x * y;

        return product;
    }
}
