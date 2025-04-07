package files;

import java.util.ArrayList;

public class ArrayListDays {

    public static void main(String[] args){

        ArrayList<String> days = new ArrayList<String>();

        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");

            System.out.println(days);

            for (int i = 0; i < days.size(); i++){
                System.out.println(days.get(i));
            }
    }
}
