package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b;

        System.out.println("ввести a, b:");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();

        miniNumber(a,b);

    }

    static int miniNumber(int a, int b) {
        if (a > b) {
            System.out.println("MinNumber :" + b);
            return b;
        } else if (a==b) {
            System.out.println(" цифри рівні");
            return a;
        } else {
            System.out.println("MinNumber :" + a);
            return a;
        }
    }
}
