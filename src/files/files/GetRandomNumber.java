// GetRandomNumber.java: this programs gets the random integer generated in GenerateRandomInteger.java!
package files;

public class GetRandomNumber {

    public static void main(String[] args){

        int random_num = GenerateRandomInteger.rando();
        System.out.println("\nThe random number generated in GenerateRandomNumber.java is: " + random_num);
    }
}
