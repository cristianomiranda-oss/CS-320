package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.snhu.Task;
import edu.snhu.TaskService;

class TaskServiceTest {

	// Tests the adding of a task
	@DisplayName("Adding New Tasks")
	@Test
	void testAddTask() {
		TaskService taskService = new TaskService();
		taskService.addTask("Task 1", "An important task to do...");
		Task createdTask = taskService.getTask("0");
		
		assertTrue(createdTask.getTaskId().equals("0"));
		assertTrue(createdTask.getTaskName().equals("Task 1"));
		assertTrue(createdTask.getTaskDescription().equals("An important task to do..."));
	}
	
	// Tests the removing of a task
	@DisplayName("Removing Task")
	@Test
	void testRemoveTask() {
		TaskService taskService = new TaskService();
		taskService.addTask("Task 1", "An important task to do...");
		taskService.removeTask("0");
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			taskService.getTask("0");
		});
	}
	
	// Tests the removing of a task not present in the list
	@DisplayName("Removing Null Task")
	@Test
	void testRemovingNullTask() {
		TaskService taskService = new TaskService();

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			taskService.removeTask("0");
		});
	}

	// Tests the updating of the task name attribute for tasks within the list
	@DisplayName("Update Task Name")
	@Test
	void testUpdateTaskName() {
		TaskService taskService = new TaskService();
		taskService.addTask("Task 1", "An important task to do...");
		taskService.updateTaskName("0", "Task 2");
		Task createdTask = taskService.getTask("0");
		
		assertTrue(createdTask.getTaskId().equals("0"));
		assertTrue(createdTask.getTaskName().equals("Task 2"));
		assertTrue(createdTask.getTaskDescription().equals("An important task to do..."));
	}
	
	// Tests the updating of the task description attribute for tasks within the list
	@DisplayName("Update Task Description")
	@Test
	void testUpdateTaskDescription() {
		TaskService taskService = new TaskService();
		taskService.addTask("Task 1", "An important task to do...");
		taskService.updateTaskDescription("0", "A very important task we need to do...");
		Task createdTask = taskService.getTask("0");
		
		assertTrue(createdTask.getTaskId().equals("0"));
		assertTrue(createdTask.getTaskName().equals("Task 1"));
		assertTrue(createdTask.getTaskDescription().equals("A very important task we need to do..."));
	}
}
