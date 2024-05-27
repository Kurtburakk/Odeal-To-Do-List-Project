/*
 * Burak KURT
 * Case 1 Java to-do-List
 * This class manage todolist 
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> tasks;   // this list hold to all tasks 

    public ToDoList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String description, int priority) {     // add task and hold to priority 
        Task newTask = new Task(description, priority);
        tasks.add(newTask);
        tasks.sort((task1, task2) -> Integer.compare(task2.gettasklevel(), task1.gettasklevel()));
        // this part sort add function because time complexity more efficiently
    }

    public void removeTask(int index) {     // remove task according to enter index number 
        index--;        // fix index number
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index); // my index started 0 
        }
    }

    public void markTaskCompleted(int index) {  // sign the attend task 
        index--;        // fix index number
        if (index >= 0 && index < tasks.size()) {   
            Task task = tasks.get(index);
            task.setCompleted(true);
        }
    }

    public void printTasks() {          // print the all task with sorted 
        System.out.println();
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
        System.out.println();
    }
}
