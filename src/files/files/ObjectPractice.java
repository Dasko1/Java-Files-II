package files;

public class ObjectPractice {

    public int num(){

        int x = 7;

        return x;
    }

    public static void main(String[] args){

        ObjectPractice objects = new ObjectPractice();
        System.out.println("\nThe number is: " + objects.num());
    }
}
