/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cls5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author ulacit
 */
public class Cls5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*for (var i = 0; i < 10; i++) {
            System.out.println("id 1  i =>" + i);
        }

        for (var i = 0; i < 10; i++) {
            System.out.println("id 2  i =>" + i);
        }

        for (var i = 0; i < 10; i++) {
            System.out.println("id 3  i =>" + i);
        }*/

        var thread1 = new ThreadFor(1);
        thread1.start();
        
        var thread2 = new ThreadFor(2);
        thread2.start();
       
        var thread3 = new ThreadFor(3);
        thread3.start();
        
        
    }

}
