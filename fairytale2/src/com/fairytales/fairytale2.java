package com.fairytales;

import java.util.Random;
import java.util.Scanner;


public class fairytale2 {

    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        Scanner scr = new Scanner(System.in);
        System.out.println("You have three roads, choose one of them");
        int road = scr.nextInt();

        if (road == 1) {
            System.out.println("you will meet witch" + "\n " + "please take a road");

            if (scr.nextInt() == 1) {
                System.out.println("to fight, and enter random number");
                int m = scr.nextInt();
                int num = (int)(Math.random() * 100);

                System.out.println(num);


                if (m >= 10 && m <= 40) {
                    if (num >= 20 && num <= 30)
                        System.out.println("you win");
                    else
                        System.out.println("sorry, you death");
                } else {
                    System.out.println("sorry, you death");

                }

            } else if (road == 2) {
                System.out.println("you will meet a horse");
                if (scr.nextInt() == 1) {
                    System.out.println(" you will fight with dragon");
                } else {
                    System.out.println(" Your road is free from witches");
                }
            } else if (road == 3) {
                System.out.println("you will meet a house");
            } else {
                System.out.println("you return back");
            }
        }
    }
}



