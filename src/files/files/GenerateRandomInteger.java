// GenerateRandomInteger.java: this class generates a random number which can be printed out in GetRandomNumber.java!
// Note the possibility for the inline variable.
package files;

import java.util.Random;

public class GenerateRandomInteger {

    public static int rando() {

        // Create instance of Random class!
        Random rand = new Random();

        // Generate random integers in from 0 to 999! You can also create an inline variable: return rand.nextInt(1000)
        int rand_int1 = rand.nextInt(1000);

        return rand_int1;
    }

    public static int rando1(){

        Random rand1 = new Random();

        int rand_int2 = rand1.nextInt(1000);

        return rand_int2;
    }
}
