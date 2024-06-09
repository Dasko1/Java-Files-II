// Use ArrayEasy.java for help; DayRandom.java will get the randomly-generated day of the week.
// There are 2 diffent actions here in the method ArrayRandomDayPick: 1) ll.12-16 creates a random number between 0-6 to pick a
// day of the week, and 2) ll.18-19 creates the day of the week array itself. l.21 ends the method.
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
