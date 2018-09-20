package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Fifo {
    static int[] list = {4, 6, 78, 45, 2, 45, 9, 8, 5, 23};
    static Queue<Integer> queue = new LinkedList();
    static Stack<Integer> stack = new Stack();

    public static void main(String[] args) {
        queueadd(queue);
        System.out.println("\n");
        stack_pop(stack);
    }

    public static void queueadd(Queue<Integer> queue) {
        for (int i = 0; i < list.length; i++)
            queue.add(list[i]);


        try {
            for (int i = 0; i < list.length; i++) {


                System.out.println("Removed element queue =" + queue.remove());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void stack_pop(Stack<Integer> stack) {
        for (int i = 0; i < list.length; i++)
            stack.push(list[i]);

        try {
            for (int i = 0; i < list.length; i++) {

                System.out.println("Removed element stack" + (Integer) stack.pop());
                Thread.sleep(1000);
            }
        } catch (InterruptedException s) {
            s.printStackTrace();
        }

    }
}
