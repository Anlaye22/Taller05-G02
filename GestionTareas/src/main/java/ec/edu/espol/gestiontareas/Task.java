/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espol.gestiontareas;

import java.util.List;

/**
 *
 * @author GENERATION 10
 */
public abstract class Task {
    private String name;
    private String priority;
    private List<Observer> observadores;

    abstract String getName(); // Obtener el nombre de la tarea
    abstract String getPriority(); // Obtener la prioridad de la tarea
    abstract void addObserver(Observer observer); // Agregar un observador
    abstract void removeObserver(Observer observer); // Eliminar un observador
    abstract void notifyObservers(); // Notificar a todos los observadores
}

