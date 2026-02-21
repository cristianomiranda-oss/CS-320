package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import edu.snhu.Task;

class TaskTest {

    // Tests the instantiation of a new Task Object
    @DisplayName("New Task Test")
    @Test
    void testTask() {
        Task taskObj = new Task("12345", "Task 1", "Task to do...");
        assertTrue(taskObj.getTaskId().equals("12345"));
        assertTrue(taskObj.getTaskName().equals("Task 1"));
        assertTrue(taskObj.getTaskDescription().equals("Task to do..."));
    }

    // Tests if the length validation argument is thrown by passing in a taskId that
    // exceeds 10 characters
    @DisplayName("Task Id Length Validation")
    @Test
    void testTaskIdLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Task("12345678901", "Task 1", "Task to do...");
        });
    }

    // Tests if the length validation argument is thrown by passing in a task name
    // that
    // exceeds 20 characters
    @DisplayName("Task Name Length Validation")
    @Test
    void testTaskNameLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Task("12345", "Task 1234567890123456", "Task to do...");
        });
    }

    // Tests if the length validation argument is thrown by passing in a task
    // description that
    // exceeds 50 characters
    @DisplayName("Task Description Length Validation")
    @Test
    void testTaskDescriptionLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Task("12345", "Task 1",
                    "Important task that needs to be done at this moment in time and at this place and time today if possible........");
        });
    }

    // Tests if the null validation argument is thrown by passing in a null value
    // for the taskId
    @DisplayName("Task Id Null Validation")
    @Test
    void testTaskIdNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Task(null, "Task 1", "Task to do...");
        });
    }

    // Tests if the null validation argument is thrown by passing in a null value
    // for the task name
    @DisplayName("Task Name Null Validation")
    @Test
    void testTaskNameNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Task("12345", null, "Task to do...");
        });
    }
    // Tests if the null validation argument is thrown by passing in a null value
    // for the task description

    @DisplayName("Task Description Null Validation")
    @Test
    void testTaskDescriptionNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Task("12345", "Task 1", null);
        });
    }
}
