import java.util.HashMap;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> toDo = Handler.taskInput(scanner);

        Handler.printTodo(toDo);

        Handler.updateTodo(toDo);
        Handler.printTodo(toDo);

        Handler.removeTodo(toDo);
        Handler.printTodo(toDo);

        scanner.close();
    }
}
