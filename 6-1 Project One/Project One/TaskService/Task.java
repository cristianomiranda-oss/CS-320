package edu.snhu;

public class Task {

    // Declares various attributes for the class
    private String taskId;
    private String name;
    private String description;

    public Task(String id, String name, String description) {
        // Checks if the passed in id value is null or longer than 10 characters
        if (id == null || id.length() > 10) {
            // throws an error for the id value
            throw new IllegalArgumentException("Invalid Task ID");
        }
        // Checks if the passed in name value is null or longer than 20 characters
        if (name == null || name.length() > 20) {
            // throws an error for the name value
            throw new IllegalArgumentException("Invalid Task Name");
        }
        // Checks if the passed in description value is null or longer than 50
        // characters
        if (description == null || description.length() > 50) {
            // throws an error for the description value
            throw new IllegalArgumentException("Invalid Task Description");
        }

        // Assigns all attributes with their respective parameter values
        this.taskId = id;
        this.name = name;
        this.description = description;
    }

    public String getTaskId() {
        // Returns the task's id value
        return this.taskId;
    }

    public String getTaskName() {
        // Returns the task's name value
        return this.name;
    }

    public void setTaskName(String name) {
        // Checks if the passed in name value is null or longer than 20 characters
        if (name == null || name.length() > 20) {
            // throws an error for the name value
            throw new IllegalArgumentException("Invalid Task Name");
        }

        // Sets the name attribute to the value passed in
        this.name = name;
    }

    public String getTaskDescription() {
        // Returns the task's description value
        return this.description;
    }

    public void setTaskDescription(String description) {
        // Checks if the passed in description value is null or longer than 50
        // characters
        if (description == null || description.length() > 50) {
            // throws an error for the description value
            throw new IllegalArgumentException("Invalid Task Description");
        }

        // Sets the description attribute to the value passed in
        this.description = description;
    }
}
