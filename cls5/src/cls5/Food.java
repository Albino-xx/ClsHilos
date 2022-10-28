/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cls5;

/**
 *
 * @author ulacit
 */
public class Food {

    private int eatTime;

    synchronized int eat(String name) {

        System.out.println("Starting to eat");

        try {

            eatTime = (int) ((name.equals("Rabbit") ? 200 : 100) * Math.random());
            wait(this.eatTime);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return eatTime;
    }
}