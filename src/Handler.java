import java.util.ArrayList;

public class Handler {

    // A method to loop through the array list and prints out each item

    public static void loopToDo(ArrayList<String> toDo) {
        // adds an incrementing number beside the to-do item
        int number = 0;

        for (int i = 0; i < toDo.size(); i++) {
            number++;
            System.out.println(number + ". " + toDo.get(i));
        }
    }
}
