package edu.snhu;

import java.util.ArrayList;

public class TaskService {

    // Declares an array list to store all tasks
    private ArrayList<Task> Tasks;

    // Declares a var to store the currentTaskId value
    private int currentTaskId = 0;

    public TaskService() {
        // Initializes the Tasks var with a new ArrayList
        this.Tasks = new ArrayList<Task>();
    }

    public void printAllTasks() {
        // Iterates through the tasks array list
        for (int i = 0; i < Tasks.size(); i++) {
            // Stores the current task in a var
            Task currTask = Tasks.get(i);
            // Calls the method to display the current task
            currTask.displayTask();
        }
    }

    public Task getTask(String taskId) {
        // Iterates through the tasks array list
        for (int i = 0; i < Tasks.size(); i++) {
            // Stores the current task in a var
            Task currTask = Tasks.get(i);
            // Checks if the current task's id matches the one passed in
            if (currTask.getTaskId().equals(taskId)) {
                // Returns the current task object
                return currTask;
            }
        }

        // If no matching task is found in the array list an error is thrown
        throw new IllegalArgumentException("Task Id Is Not In The List");
    }

    public void addTask(String name, String description) {
        // Stores the value of currentTaskId and then increments the attribute value
        String newTaskId = Integer.toString(currentTaskId++);

        // Instantiates a new task object using the passed in values and the new task id
        Task newTask = new Task(newTaskId, name, description);
        // Appends the new task to the Task List
        Tasks.add(newTask);
    }

    public void removeTask(String taskId) {
        // Iterates through the tasks array list
        for (int i = 0; i < Tasks.size(); i++) {
            // Stores the current task in a var
            Task currTask = Tasks.get(i);
            // Checks if the current task's id matches the one passed in
            if (currTask.getTaskId().equals(taskId)) {
                // Removes the task located at the current index
                Tasks.remove(i);
                // Exits the function
                return;
            }
        }

        // If no matching task is found in the array list an error is thrown
        throw new IllegalArgumentException("Task Id Is Not In The List");
    }

    public void updateTaskName(String taskId, String name) {
        // Calls the method to find the task associated with the passed in taskId
        Task task = getTask(taskId);
        // Calls the method to update the task name to the passed in value
        task.setTaskName(name);
    }

    public void updateTaskDescription(String taskId, String description) {
        // Calls the method to find the task associated with the passed in taskId
        Task task = getTask(taskId);
        // Calls the method to update the task description to the passed in value
        task.setTaskDescription(description);
    }
}
