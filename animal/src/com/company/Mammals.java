package com.company;

public class Mammals extends Animal {
    public void move() {
        if (scan.nextBoolean()) {
            System.out.println("I`m running");
        } else {
            System.out.println("I`m not Alive, sorry!");
        }
    }
}