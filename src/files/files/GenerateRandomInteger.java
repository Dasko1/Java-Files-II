package files;

import java.util.Random;

public class GenerateRandomInteger {

    public static int rando() {

        // Create instance of Random class!
        Random rand = new Random();

        // Generate random integers in from 0 to 999!
        int rand_int1 = rand.nextInt(1000);

        return rand_int1;
    }
}
