package com.todo.api.controller;

import com.todo.api.model.Task;
import com.todo.api.service.TaskService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@Tag(name = "Task Management", description = "APIs for managing tasks in the to-do list")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    @Operation(summary = "Get all tasks", description = "Retrieve a list of all tasks")
    public List<Task> getAllTasks() {
        return taskService.getTasks();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get task by ID", description = "Retrieve a specific task by its ID")
    public Task getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id).orElseThrow(() -> new RuntimeException("Task not found"));
    }

    @PostMapping
    @Operation(summary = "Create a new task", description = "Add a new task to the to-do list")
    public Task createTask(@RequestBody Task task) {
        return taskService.addTask(task);
    }

    @PutMapping
    @Operation(summary = "Update an existing task", description = "Update the details of an existing task")
    public Task updateTask(@RequestParam Long id, @RequestBody Task task) {
        return taskService.updateTask(id, task).orElseThrow(() -> new RuntimeException("Task not found"));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a task", description = "Remove a task from the to-do list by its ID")
    public void deleteTask(@PathVariable Long id) {
        if (!taskService.deleteTask(id)) {
            throw new RuntimeException("Task not found");
        }
    }
}