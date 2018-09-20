package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int absval, val;
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter number:");
//        val = scan.nextInt();
//        absval = val > 10 ? -val : val;
//
//// выводим число
//        System.out.println("" + absval);
//
//        val = scan.nextInt();
//        absval = val > 0 ? -val : val;
//
//        System.out.println("" + absval);

        int lowNum, highNum ;
        lowNum = scan.nextInt();
        highNum = scan.nextInt();
        int largerNum = lowNum < highNum ? highNum : lowNum;
        System.out.println(largerNum);
    }
}
