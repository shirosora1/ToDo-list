import java.util.HashMap;
import java.util.Scanner;

public class Handler {
   private static Scanner scanner = new Scanner(System.in);

    public static int menu(Scanner scanner) {

        System.out.println("""
                What would you like to do?
                [1] Add task
                [2] Update task
                [3] Remove task
                [4] Exit?""");

        System.out.print("Please enter your choice: ");
        int menuChoice = scanner.nextInt();
        scanner.nextLine();

        return menuChoice;
    }

    public static HashMap<Integer, String> taskInput(Scanner scanner) {

        HashMap<Integer, String> tasks = new HashMap<>();

        if (menu(scanner) == 1) {
            System.out.println("Enter a task: ");
            String task = scanner.nextLine();
            int position = 1;

            tasks.put(position, task);

            // loops the user input so asks for a new task until the user ends it with "!!"
            while (!task.equals("!!")) {

                System.out.println("Enter a task: ");
                task = scanner.nextLine();
                position++;

                // exits the loop once "!!" is entered
                if (task.equals("!!")) {
                    break;
                }
                // Adds tasks here so "!!" isn't included in the list
                tasks.put(position, task);
            }
        }
        return tasks;
    }

    // updates the to-do list from hashmap key
    public static void updateTodo(HashMap<Integer, String> updateToDo) {

        if (menu(scanner) == 2) {

            printTodo(updateToDo);

            System.out.println("What number would you like to update?");
            int taskNumber = scanner.nextInt();
            scanner.nextLine();

            System.out.println("What do you want to replace it with?: ");
            String replacedValue = scanner.nextLine();

            boolean updated = updateToDo.containsKey(taskNumber);

            if (updated) {
                updateToDo.replace(taskNumber, replacedValue);
            }
        }
    }

    // removes the to-do list item from hashmap key
    public static void removeTodo(HashMap<Integer, String> removeToDo) {

        if (menu(scanner) == 3) {

            printTodo(removeToDo);

            System.out.println("What number would you like to remove?");
            int taskNumber = scanner.nextInt();
            scanner.nextLine();

            boolean updated = removeToDo.containsKey(taskNumber);

            if (updated) {
                System.out.println(removeToDo.get(taskNumber) + " has been removed");
                removeToDo.remove(taskNumber);
                System.out.println();
            }
        }
    }

    // prints the to-do list with numbering
    public static void printTodo(HashMap<Integer, String> toDo) {
        for (Integer i : toDo.keySet()) {
            System.out.println((i) + ". " + toDo.get(i));
        }
    }
}