/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cls5;

import java.util.Random;



public class Animal extends Thread implements Runnable {

    private String name;
    private int position, speed, restMax;
    private Food food = new Food();

    private Random random = new Random();

    private static boolean winner = false;

    private Animal(String name, int speed, int restMax, Food food) {
        this.name = name;
        this.speed = speed;
        this.restMax = restMax;
        this.food = food;
    }

    public static void main(String[] args) {

        Food food = new Food();

        Animal rabbit = new Animal("Rabbit", 5 ,150, food);
        rabbit.setDaemon(false);

        Animal turtle = new Animal("Turtle", 3, 100, food);
        turtle.setDaemon(false);

        rabbit.start();
        turtle.start();
    }

    @Override
    public void run() {

        int finishPosition = 100;

        while (this.position <= finishPosition && !winner) {

            System.out.println(this.name + " : " + this.position + " yards");

            try {

                int rest = this.random.nextInt(this.restMax);
                Animal.sleep(rest);

                food.eat(this.name);

                this.position += this.speed;

                System.out.println();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (this.position >= finishPosition) {

                winner = true;

                System.out.println("The race is over!");
                System.out.println(this.name + " wins!");
            }
        }
    }
}

