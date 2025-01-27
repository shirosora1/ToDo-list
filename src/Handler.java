import java.util.ArrayList;

public class Handler {

    // A method to loop through the array list and prints out each item

    public static void loopToDo(ArrayList<String> toDo) {
        // adds an incrementing number beside the to-do item
        int number = 0;

        // Enhanced for loop: 's' represents the data itself (e.g., "Cook dinner")
        // from the list, rather than an index
        for (String s : toDo) {
            number++;
            System.out.println(number + ". " + s);
        }
    }
}
