package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int     a,b,c,d;
        float   x1,x2;
    do {
        System.out.println("ввести a, b, c");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        // System.out.println(discriminant(a,b,c));
//        System.out.println(cvad(2));
        d = discriminant(a, b, c);

        if (d < 0) {
            System.out.println(" корня немає");
        } else if (d == 0) {
            System.out.println("рівняння має один корінь " + -b / (2 * a));
        } else {
            x1 = kor1(a, b, d);
            x2 = kor2(a, b, d);
            System.out.println("корні рівняння  x1=" + x1 + "  x2= " + x2);
        }
    } while (true);


    }
    static int discriminant(int a, int b, int c){
        int d;
        d = cvad(b)-4*a*c;
        return d;
    }

    static int cvad(int x){
        return x*x;
    }

    static float kor1 (int a, int b, int d) {
        float k;
        k = (float)((-b + Math.sqrt(d))/(2*a));
        return k;
    }

    static float kor2 (int a, int b, int d) {
        float k;
        k = (float)((-b - Math.sqrt(d))/(2*a));
        return k;
    }
}
