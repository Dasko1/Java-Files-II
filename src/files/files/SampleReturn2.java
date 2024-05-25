// This shows the return value in the same file!
package files;

import java.util.Random;

public class SampleReturn2
{
    /* Method with an integer return type and no arguments */
    public int CompareNum()
    {
        // Create instance of Random class!
        Random rand = new Random();

        int x = rand.nextInt(1000);
        int y = rand.nextInt(1000);
        System.out.println("x = " + x + "\ny = " + y);
        if(x > y)
            return x;
        else
            return y;
    }

    /* Driver Code: you can also look at GetSampleReturn2.java!  To do this in one file, uncomment ll.23-29!
    public static void main(String args[])
    {
        SampleReturn2 obj = new SampleReturn2();
        int result = obj.CompareNum();
        System.out.println("The greater number among x and y is: " + result);
    }*/
}
