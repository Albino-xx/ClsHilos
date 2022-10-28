/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cls5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ulacit
 */
public class RunnableFor implements Runnable {

    private int id;

    public RunnableFor(final int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (var i = 0; i < 10; i++) {
            System.out.println("id => " + id + " i => " + i);
            try {
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException ex) {
                Logger.getLogger(RunnableFor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
