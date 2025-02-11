import java.util.HashMap;
import java.util.Scanner;

public class Handler {
   private final Scanner scanner;
   private final HashMap<Integer, String> toDo;
   private Integer taskId = 1;

    public Handler() {
        this.toDo = new HashMap<>();
        this.scanner = new Scanner(System.in);
    }

    public void menu() {
        int menuChoice;
        boolean isRunning = true;

        while(isRunning) {

            System.out.println("""
                    -------------
                    To-Do List
                    -------------
                    1.Add task
                    2.View tasks
                    3.Update task
                    4.Remove task
                    5.Exit
                    -------------
                    """);

            System.out.print("Enter your choice (1-5): ");

            menuChoice = scanner.nextInt();
            scanner.nextLine();

            switch (menuChoice) {
                case 1 -> addTask();
                case 2 -> printTodo();
                case 3 -> updateTodo();
                case 4 -> removeTodo();
                case 5 -> isRunning = false;
                default -> System.out.print("Please enter a number between 1 and 5");
            }
        }

    }

    public void addTask() {

            System.out.print("Enter a task: ");
            String task = scanner.nextLine();

                if (task.isEmpty()) {
                    System.out.println("You didn't add a task");
                } else {

                    System.out.println("Current keys: " + toDo.keySet());

                    toDo.put(taskId, task);
                    taskId++;
                    System.out.println("Keys after loop: " + toDo.keySet());
                }
    }

    // updates the to-do list from hashmap key
    public void updateTodo() {

            printTodo();

            System.out.println("What number would you like to update?");
            int taskNumber = scanner.nextInt();
            scanner.nextLine();

            System.out.println("What do you want to replace it with?: ");
            String replacedValue = scanner.nextLine();

            boolean updated = toDo.containsKey(taskNumber);

            if (updated) {
                toDo.replace(taskNumber, replacedValue);
            }
    }

    // removes the to-do list item from hashmap key
    public void removeTodo() {

            printTodo();

            System.out.println("What number would you like to remove?");
            int taskNumber = scanner.nextInt();
            scanner.nextLine();

            boolean updated = toDo.containsKey(taskNumber);

            if (updated) {
                System.out.println("-------------");
                System.out.println(toDo.get(taskNumber) + " has been removed");
                toDo.remove(taskNumber);
            }
    }

    // prints the to-do list with numbering
    public void printTodo() {
        for (Integer i : toDo.keySet()) {
            System.out.println((i) + ". " + toDo.get(i));
        }
    }
}