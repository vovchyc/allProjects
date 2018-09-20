package com.company;

import java.util.Scanner;

public class Main {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Birds sparrow = new Birds();
        sparrow.isAlive = true;
        sparrow.swim = false;
        if(sparrow.isAlive){
        sparrow.move();
        sparrow.eat();
        sparrow.voice();
    }

        Birds pelican = new Birds();
        pelican.swim = true;
        pelican.isAlive = true;
        if (pelican.isAlive) {
            pelican.move();
            pelican.eat();
            pelican.voice();
        }

        Fish tuna = new Fish();
        tuna.isAlive = true;
        tuna.info();

        EatingMeat tiger = new EatingMeat();
        tiger.name();
        tiger.move();
        tiger.eat();
        tiger.voice();
        tiger.isAlive = true;

        EatingGrass elephant = new EatingGrass();
        elephant.name();
        elephant.move();
        elephant.eat();
        elephant.voice();
        elephant.isAlive = true;
    }
}
