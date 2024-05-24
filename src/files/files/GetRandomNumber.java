// GetRandomNumber.java: this program gets the random integer generated in GenerateRandomInteger.java!
package files;

public class GetRandomNumber {

    public static void main(String[] args){

        // Result 1: a random number is generated and printed out from GenerateRandomInteger.java
        int random_num = GenerateRandomInteger.rando();
        System.out.println("\nResult 1: The random number generated in GenerateRandomNumber.java is: " + random_num);

        // The line below gets a random number generated in Generate2ndRandomInteger.java
        int random_num1 = Generate2ndRandomInteger.rando1();

        // Result 2: The method below computes and prints the value from Add2RandomNumbers.java.
        int add2randomnumbers = Add2RandomNumbers.randomNumbersAdd();
        System.out.println("\nResult 2: The sum of 2 randomly-generated numbers is: " + add2randomnumbers);

        // Result 3: The method below adds & shows the numbers randomly generated in ll. 9 & 13.
        int rand_adds = (random_num + random_num1);
        System.out.println("\nResult 3: The sum of the two randomly-generated numbers " + random_num + " & " + random_num1 + " is: " + rand_adds);

    }
}
