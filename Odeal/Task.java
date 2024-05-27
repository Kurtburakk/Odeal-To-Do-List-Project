/*
 * Burak KURT
 * Case 1 Java to-do-List
 * This class hold to attend task 
 * 
 */

public class Task {
    private String enterTask;       // hold to task 
    private boolean isCompleted;    // hold to completed or not completed 
    private int taskLevel;          // hold to task priority
    

    public Task(String enterTask, int taskLevel) {
        
        this.enterTask = enterTask;
        this.isCompleted = false;
        this.taskLevel = taskLevel;

    }

    public String getenterTask() {
        return enterTask;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public int gettasklevel() {
        return taskLevel;
    }

    public void settaskLevel(int taskLevel) {
        this.taskLevel = taskLevel;
    }

    @Override
    public String toString() {  // convert string 
        return (isCompleted ? "[ Completed ] " : " [Not completed ] ") + enterTask + " (taskLevel: " + taskLevel + ")";
    }
}
