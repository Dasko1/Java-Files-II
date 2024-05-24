package files;

public class GetAdd2RandomNumbersResult {

    public static void main(String[] args ){

        int random_num = GenerateRandomInteger.rando();
        int random_num1 = GenerateRandomInteger.rando1();

        int sum = random_num + random_num1;

        System.out.println("\nThe sum of the randomly-generated numbers " + random_num + " and " + random_num1 + " is: " + sum);
    }
}
