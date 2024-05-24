// See GetRandomNumber.java ll.15-17! Even more interesting, see GetAdd2RandomNumbersResult.java!
package files;

import java.util.Random;

public class Add2RandomNumbers {

    public static int randomNumbersAdd(){

        Random rand = new Random();

        int randInt_1 = rand.nextInt(1000);
        int randInt_2 = rand.nextInt(1000);

        int sum = randInt_1 + randInt_2;

        return sum;
    }
}
