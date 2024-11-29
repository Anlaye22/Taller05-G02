/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.gestiontareas;

/**
 *
 * @author GENERATION 10
 */
import java.util.ArrayList;
import java.util.List;

public class ConcreteFactoryComplexTask extends Task {
    private String name; // Nombre de la tarea
    private String priority; // Prioridad de la tarea
    private String dueDate; // Fecha de vencimiento de la tarea
    private List<Task> subtasks; // Lista de subtareas asociadas
    private List<Observer> observers; // Lista de observadores para notificaciones

    // Constructor
    public ConcreteFactoryComplexTask(String name, String priority, String dueDate) {
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
        this.subtasks = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    // Métodos de la interfaz Task
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPriority() {
        return priority;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    // Métodos adicionales específicos de ComplexTask
    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
        notifyObservers(); // Notificar a los observadores del cambio
    }

    public void addSubtask(Task subtask) {
        subtasks.add(subtask);
        notifyObservers(); // Notificar a los observadores del cambio
    }

    public void removeSubtask(Task subtask) {
        subtasks.remove(subtask);
        notifyObservers(); // Notificar a los observadores del cambio
    }

    public List<Task> getSubtasks() {
        return subtasks;
    }

    @Override
    public String toString() {
        return "ComplexTask{" +
                "name='" + name + '\'' +
                ", priority='" + priority + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", subtasks=" + subtasks.size() +
                '}';
    }
}

