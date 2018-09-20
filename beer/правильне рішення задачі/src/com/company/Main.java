import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("age");
        int age = scan.nextInt();
        System.out.print("money");
        int money = scan.nextInt();
        System.out.print("nudity");
        int nudity = scan.nextInt();



        if (age >= 21 && money >= 20) {
            System.out.println("true");
        } else if (money >= 20 && nudity >= 7) {
            System.out.println("true");
        } else if (age >= 21 && nudity >= 7) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}