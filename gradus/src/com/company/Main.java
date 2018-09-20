package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введіть день тижня від 1 до 7:");
        int day = scan.nextInt();


        int deegre = Gradus(day);
        int sun = Sonce(day);

        if (day > 7 || day < 1) {
            System.out.println("таких днів не ісує, введіть коректне число");
        } else  if (day==3){
            System.out.println("температура сьогодні:" + sun);
        }else{
            System.out.println("температура сьогодні:" + deegre);
        }
    }
    static int Sonce(int deegre){
        int s = deegre* 10;
        return s;
    }
    static int Gradus(int day) {
        int g = day * 10;
        return g;
    }

}
