/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.gestiontareas;

/**
 *
 * @author GENERATION 10
 */

public class SMSNotification implements Observer {
    @Override
    public void update(Task task) {
        System.out.println("SMS Notification: Task '" + task.getName() + "' updated!");
    }
}
