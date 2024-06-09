// Use ArrayEasy.java for help; DayRandom.java will get the randomly-generated day of the week.
package files;

import java.util.Random;

public class ArrayRandomDayPick {

    public String arrayDay(){

        // Create an instance of Random class to generate a random number up to 7 to pick a day from the l.15 array!
        Random rand = new Random();

        // Generate random integers in from 0 to 6!
        int daynumber = rand.nextInt(7);

        String[] arraydays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String day = arraydays[daynumber];

        return day;
    }
}
