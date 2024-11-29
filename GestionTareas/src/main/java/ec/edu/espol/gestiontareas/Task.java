/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espol.gestiontareas;

/**
 *
 * @author GENERATION 10
 */
public interface Task {
    String getName(); // Obtener el nombre de la tarea
    String getPriority(); // Obtener la prioridad de la tarea
    void addObserver(Observer observer); // Agregar un observador
    void removeObserver(Observer observer); // Eliminar un observador
    void notifyObservers(); // Notificar a todos los observadores
}

