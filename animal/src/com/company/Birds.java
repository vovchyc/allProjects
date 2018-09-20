package com.company;

public class Birds extends Animal {


    void move() {
        System.out.println("If bird Alive enter True, else -  False");
        if (scan.nextBoolean() && this.swim == false) {
            System.out.println("I`m sparrow, I fly in the sky ");
        } else {
            System.out.println("I`m pelican, I try to fly and swim ");
        }
    }
    void eat () {
        if (swim == true) {
                System.out.print("I love to eat fresh grains and fish! ");
        } else {
            System.out.print("I love to eat fresh grains! ");
        }
    }
    void voice () {
        if (swim == true) {
            System.out.println("I say:'I want to eat' ");
        } else {
            System.out.print("I say squirrel;" + "\n ");
        }
    }


    }


