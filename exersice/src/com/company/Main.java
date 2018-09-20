package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1st num : ");
        int min = scanner.nextInt();
        System.out.println("2nd num : ");
        int max = scanner.nextInt();


        Random random = new Random(System.currentTimeMillis());
        int num = random.nextInt((max - min) + 1) + min;

        System.out.println( num);


       if (num >= 10 && num <= 99){
           System.out.println( "two-digit number");
        } else if (num >= 100 && num <= 999){
            System.out.println("three-digit number");
       } else {
           System.out.println("single number" );}


    }
}
