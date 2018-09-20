package com.company;

public class Mammals extends Animal {
    public void move() {
        System.out.println("If Animal Alive enter True, else -  False");
        if (scan.nextBoolean() && this.swim == false) {
            System.out.println("I`m tiger, I run so fast ");
        } else {
            System.out.println("I`m elephant, I try to run and swim ");
        }
    }
}