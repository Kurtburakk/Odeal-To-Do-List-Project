/*
 * Burak KURT
 * Case 1 Java to-do-List
 * This class main for the test 
 * 
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList todolist = new ToDoList();

        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. List Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // hold to new line 

            
            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter task level (1-3): ");
                    int taskLevel = scanner.nextInt();
                    todolist.addTask(description, taskLevel);
                    break;
                case 2:
                    todolist.printTasks();
                    System.out.print("Enter index for task index to remove (You seleceted given above task) :");
                    int removeIndex = scanner.nextInt();
                    todolist.removeTask(removeIndex);
                    break;
                case 3:
                    todolist.printTasks();
                    System.out.print("Enter task index to mark as completed (You seleceted given above task) :");
                    int completedIndex = scanner.nextInt();
                    todolist.markTaskCompleted(completedIndex);
                    break;
                case 4:
                    System.out.println();       // fixes print screen 
                    todolist.printTasks();
                    System.out.println();       // fixes print screen 
                    break;
                case 5:
                    System.out.println("Exit");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option, please choose again.");
            }
        }
    }
}
