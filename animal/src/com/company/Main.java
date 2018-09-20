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
        tiger.isAlive = true;
        tiger.swim = false;
        if (tiger.isAlive) {
            tiger.move();
            tiger.eat();
            tiger.voice();
        }

        EatingGrass elephant = new EatingGrass();
        elephant.isAlive = true;
        elephant.swim = true;
        elephant.move();
        elephant.eat();
        elephant.voice();

    }
}
