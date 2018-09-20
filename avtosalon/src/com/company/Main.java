package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int num;

        Car reno = new Car("Reno", 7, 100, "black", false);
        Car volvo = new Car("Volvo", 3, 140, "silver", false);
        Car peugeot = new Car("Peugeot", 1, 90, "black", true);
        Car mers = new Car("Mers", 15, 120, "white", false);
        Car fiat = new Car("Fiat", 7, 100, "pink", false);
        Car java = new Car("Java", 1, 90, "blue", true);

        do {

            System.out.println("**************************************");

            System.out.println("Автосалон вітає Вас!" + "\n " + "Щоб переглянути весь каталог введіть 1" + "\n " +
                    "Щоб змінити параметри введіть 2" + "\n " + "Щоб купити машину введіть 3" + "\n " + "Щоб вийти введіть 4");

            Scanner scan = new Scanner(System.in);
            num = scan.nextInt();


            // Array of objects
            Car[] cars = {reno, volvo, peugeot, mers, fiat, java};
            if (num == 1) {
                for (int i = 0; i < cars.length; i++) {
                    System.out.print(i + 1 + " ");
                    cars[i].showName();
                }

                System.out.println("Щоб вибрати конкретну машину, введіть її порядковий номер");
                int index = scan.nextInt();

                if (index > 6 || index < 1) {
                    System.out.println("Попробуйте ще раз");
                } else {
                    System.out.println("Обране авто: " + cars[index - 1].getName()
                            + "; вік " + cars[index - 1].getAge() + "; швидкість " + cars[index - 1].getSpeed() + "; колір "
                            + cars[index - 1].getColor() + "; стан " + cars[index - 1].getBeaten());
                    System.out.println("Якщо Ви хочете купити цю машину введіть 1");
                    int row = scan.nextInt();
                    if (row == 1) {
                        System.out.println("Ви купили авто " + cars[index - 1].getName());
                    } else {
                        System.out.println("Попробуйте ще раз ");
                    }

                }
            } else if (num == 2) {
                System.out.println("Виберіть машину, щоб змінити параметри");
                for (int i = 0; i < cars.length; i++) {
                    System.out.print(i + 1 + " ");
                    cars[i].showName();

                }

                int index = scan.nextInt();

                if (index > 6 || index < 1) {
                    System.out.println("Попробуйте ще раз");
                } else {
                    System.out.println("Ви вибрали авто для модифікації: " + cars[index - 1].getName());

                    System.out.println("Виберіть параметри для зміни 1-ім'я; 2 - вік;" +
                            " 3 - швидкість; 4 - колір; 5 - стан ");
                    switch (scan.nextInt()) {
                        case 1: {
                            cars[index - 1].setName(scan.next());
                            break;
                        }
                        case 2: {
                            cars[index - 1].setAge(scan.nextInt());
                            break;
                        }
                        case 3: {
                            cars[index - 1].setSpeed(scan.nextInt());
                            break;
                        }
                        case 4: {
                            cars[index - 1].setColor(scan.next());
                            break;
                        }
                        case 5: {
                            cars[index - 1].setBeaten(scan.nextBoolean());
                            break;
                        }
                        default:
                            System.out.println("Попробуйте ще ");
                    }


                }
            } else if (num == 3) {
                System.out.println("Виберіть машину щоб купити");
                for (int i = 0; i < cars.length; i++) {
                    System.out.print(i + 1 + " ");
                    cars[i].showName();
                }

                int index = scan.nextInt();

                if (index > 6 || index < 1) {
                    System.out.println("Попробуйте ще раз");
                } else {
                    System.out.print("Ви купили авто: " + cars[index - 1].getName());
                }


                System.out.println();
            }
        }
        while (num != 4);
    }


}


