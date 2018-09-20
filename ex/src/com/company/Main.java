package com.company;

public class Main {

    public static void main(String[] args) {
	int result =0;
	for (int i =0; i < 8; i ++){
	    if(i==3 || i==6){
	        result+=10;
        }
        else {
            result+=i;
        }
    }
        System.out.println(result);
    }
}
