package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scr = new Scanner(System.in);

        System.out.println("введіть день тижня від 1-7:" );
        int day =  scr.nextInt();
        int degree = Gradus(day);


        switch (day){
            case 1:
                System.out.println("сьогодні понеділок температура дня:" + degree);
                break;
            case 2:
                System.out.println("сьогодні вівторок температура дня:" + degree);
                break;
            case 3:
                System.out.println("сьогодні середа температура дня:" + degree);
                break;
            case 4:
                System.out.println("сьогодні четвер температура дня:" + degree);
                break;
            case 5:
                System.out.println("сьогодні п'ятниця температура дня:" + degree);
                break;
            case 6:
                System.out.println("сьогодні субота температура дня:" + degree);
                break;
            case 7:
                System.out.println("сьогодні неділя температура дня:" + degree);
                break;
            default:
                System.out.println("таких днів не існує");
        }
    }
     static int Gradus(int day){
        int g = day*10;
        return g;
     }

}
