package com.company;

public class Car {

    private String name;
    private int age;
    private  int speed;
    private String color;
    private boolean beaten;

    public Car(String name, int age, int speed, String color, boolean beaten) {
        this.name = name;
        this.age = age;
        this.speed = speed;
        this.color = color;
        this.beaten = beaten;
    }

    public void showAllParameters() {
        System.out.println("Марка машини"+": "+name +", вік: "+ age+", швидкість: "+ speed+", колір: "+color+", не бита: "+beaten);

    }
    public void showName(){
        System.out.println("Марка машини"+": "+name);
    }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setSpeed(int speed) { this.speed = speed; }
    public void setColor(String color) { this.color = color; }
    public void setBeaten(boolean beaten) { this.beaten = beaten; }



    public String getName(){return this.name;}
    public int getAge(){return this.age;}
    public int getSpeed(){return this.speed;}
    public String getColor(){return this.color;}
    public boolean getBeaten(){return this.beaten;}

}