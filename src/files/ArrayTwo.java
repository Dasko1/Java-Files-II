package files;

public class ArrayTwo {

    public static void main(String[] args){

        String[] weekdays =  {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

       for (String i : weekdays){
            System.out.println(i);
        }
       System.out.println("\nThe number of elements: " + weekdays.length);
    }
}
