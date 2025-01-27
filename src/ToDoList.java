import java.util.ArrayList;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> toDo = new ArrayList<>();
        boolean updated = false;

        toDo.add("Cook dinner");
        toDo.add("Hang laundry to dry");
        toDo.add("Clean kitchen");

        System.out.println("---- ToDo ----");

        Handler.loopToDo(toDo);

        toDo.set(0, "Make a brew");
        updated = true;

        if (toDo.size() > 2) {
            String removed = toDo.remove(2);
            updated = true;

            System.out.println();
            System.out.println("Task removed: " + removed);
        }

        // separates the before and after to-do list

        if (updated) {
            System.out.println();
            System.out.println("---- Updated ToDo ----");

            Handler.loopToDo(toDo);
        }

    }
}
