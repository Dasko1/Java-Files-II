package files;

import org.testng.Assert;

public class StringArrayExample {

    public static void main(String[] args){

        String[] stringArray={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        for (String s : stringArray) {
            System.out.println(s);

            Assert.assertEquals("Friday", "Friday");
        }
    }
}
