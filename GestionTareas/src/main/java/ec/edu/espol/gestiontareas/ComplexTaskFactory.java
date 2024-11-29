/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.gestiontareas;

/**
 *
 * @author GENERATION 10
 */
public class ComplexTaskFactory implements TaskFactory {
    @Override
    public Task createTask(String name, String priority, String dueDate) {
        return new ComplexTask(name, priority, dueDate);
    }
}

