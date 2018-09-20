package com.company;

public class Cat {
        String name;
        int age;
        int speed;
        String color;
        boolean bald;

        public Cat(String name, int age, int speed, String color, boolean bald) {
            this.name = name;
            this.age = age;
            this.speed = speed;
            this.color = color;
            this.bald = bald;

        }

        public void sayHello(){
            System.out.println("My name is "+ name + ": Miayyyy!!!");
        }
}