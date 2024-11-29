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
public class SimpleTask implements Task {
    private String name; // Nombre de la tarea
    private String priority; // Prioridad de la tarea
    private List<Observer> observers; // Lista de observadores

    public SimpleTask(String name, String priority, String dueDate) {
        this.name = name;
        this.priority = priority;
        this.observers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getPriority() {
        return priority;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}

