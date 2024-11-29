/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.gestiontareas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GENERATION 10
 */
public class TaskManagerFacade {
    private TaskFactory taskFactory; // Fábrica para crear tareas
    private TaskViewStrategy taskViewStrategy; // Estrategia de visualización
    private List<Task> tasks; // Lista de tareas gestionadas

    public TaskManagerFacade(TaskFactory taskFactory, TaskViewStrategy taskViewStrategy) {
        this.taskFactory = taskFactory;
        this.taskViewStrategy = taskViewStrategy;
        this.tasks = new ArrayList<>();
    }

    public Task createTask(String name, String priority, String dueDate) {
        Task task = taskFactory.createTask(name, priority, dueDate);
        tasks.add(task);
        return task;
    }

    public void setTaskViewStrategy(TaskViewStrategy strategy) {
        this.taskViewStrategy = strategy;
    }

    public void displayTasks() {
        taskViewStrategy.displayTasks(tasks);
    }

    public void notifyTaskObservers(Task task) {
        task.notifyObservers();
    }
}

