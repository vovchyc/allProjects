package com.company;


public class Fish extends Animal {

    public void info() {
        System.out.println("If fish Alive enter True, else False");
        if (scan.nextBoolean()) {
            move();
            eat();
            voice();
        } else {
            System.out.println("I will be prepared for dinner" + "\n");
        }
    }

    @Override
        public void move() {

            System.out.println("I`m fish! I can swimming in the water");

        }
        public void eat () {
            System.out.println("I love to eat some plankton! ");
        }
        public void voice () {
            System.out.println("I say bubl-bubl-bubl"+"\n");
        }
}
