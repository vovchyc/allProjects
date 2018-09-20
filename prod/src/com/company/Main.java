package com.company;

public class Main {

    public static void main(String[] args) {

        long milisecond = 2399;
        long second = milisecond / 1000;
        long minute = second / 60;
        long hour = minute / 60;
        long daytime = hour / 12;
        long day = hour / 24;
        long year = day / 365;

        System.out.println("milisecond: " + milisecond);
        System.out.println("second:" + second);
        System.out.println("minute:" + minute);
        System.out.println("hour:" + hour);
        System.out.println ("daytime:" + daytime);
        System.out.println ("day:" + day);
        System.out.println ("year"+ year);

    }

}


