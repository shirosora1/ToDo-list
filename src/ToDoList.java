import java.util.ArrayList;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> toDo = new ArrayList<>();

        toDo.add("Cook dinner");
        toDo.add("Hang laundry to dry");
        toDo.add("Clean kitchen");

        int number = 0;

        for (int i = 0; i < toDo.size(); i++) {
            number++;
            System.out.println(number + ". " + toDo.get(i));
        }
    }
}
