// NOTE: anyday is the class object, the new instance of the class ArrayRandomDayPick, and arrayDay is the method from
// ArrayRandomDayPick.  anyday is the class object or the noun & arrayDay is the verb, or the action. In other words,
// anyday is the feature & arrayDay is the action.
package files;

public class DayRandom {

        public static void main(String[] args){

            ArrayRandomDayPick anyday = new ArrayRandomDayPick();
            System.out.println("\nThe randomly selected day is: " + anyday.arrayDay());
        }
}
