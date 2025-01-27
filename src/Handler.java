import java.util.ArrayList;

public class Handler {

    // A method to loop through the array list and prints out each item

    public static void loopToDo(ArrayList<String> tasks) {
        // Checks to make sure something is in the ArrayList, if not prints
        // a message and exits the loop
        if (tasks.isEmpty()) {
            System.out.println("Your to-do list is empty!");
            return;
        }
        // adds an incrementing number beside the to-do item
        int number = 1;

        // Enhanced for loop: 's' represents the data itself (e.g., "Cook dinner")
        // from the list, rather than an index
        for (String s : tasks) {
            System.out.println(number + ". " + s);
            number++;
        }
    }
}
