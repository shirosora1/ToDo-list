import java.util.ArrayList;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> toDo = new ArrayList<>();

        toDo.add("Cook dinner");
        toDo.add("Hang laundry to dry");
        toDo.add("Clean kitchen");

        Handler.loopToDo(toDo);

        toDo.set(0, "Make a brew");

        // separates the before and after to-do list
        System.out.println();

        Handler.loopToDo(toDo);

    }
}
