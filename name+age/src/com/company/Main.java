package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name, name1;
        int age, age1;

        System.out.println("введіть ім'я і вік");
        Scanner scan = new Scanner(System.in);
        name = scan.next();
        age = scan.nextInt();
        name1 = scan.next();
        age1 = scan.nextInt();


        result(age, name);
        result(age1, name1);

    }

    static void result(int age, String name) {
        System.out.println("Name: " + name + " Age: " + age);
    }

}


