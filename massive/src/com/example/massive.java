package com.example;

public class massive {
    public static void main(String[] args) {
        int [][] cats = new int [3][4] ;
        int a=0;
        for(int age = 0; age<3; age++)
            for ( int weigth =0; weigth<4; weigth++){
                cats [age][weigth]= a;
                a++;
                System.out.print(cats[age][weigth] + " ");
                System.out.println("\n");
        }





    }
}
//60 = cats.length
//cats[55] = 0


