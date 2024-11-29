/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.gestiontareas;

import java.util.List;

/**
 *
 * @author GENERATION 10
 */
public class ListView implements TaskViewStrategy {
    public void displayTasks(List<Task> tasks) {
        for (Task task : tasks) {
            System.out.println("Task: " + task.getName() + ", Priority: " + task.getPriority());
        }
    }
}

