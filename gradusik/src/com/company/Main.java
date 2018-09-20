package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть чило від 1 до 7");
        int day = scan.nextInt();
        int deegre = Gradus(day);

        if (day < 1 || day>7){
            System.out.println("Ввудіть коректне число");
        }
    }

}
