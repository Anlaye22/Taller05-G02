/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espol.gestiontareas;

/**
 *
 * @author GENERATION 10
 */
public interface TaskFactory {
    
    Task createTask(String name, String priority, String dueDate);
}
