package files;

import java.util.Random;

public class Generate2ndRandomInteger {

    public static int rando1(){

        Random rand1 = new Random();

        int rand_int2 = rand1.nextInt(1000);

        return rand_int2;
    }
}
