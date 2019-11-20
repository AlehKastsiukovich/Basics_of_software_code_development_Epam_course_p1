package by.etc.bscd.branches;


import java.util.Scanner;

/**
 * Даны два угла треугольника (в градусах). Определить существует ли такой треугольник
 * и если да, то будет ли он прямоугольным.
 */


public class Task1 {
    private static int a;
    private static int b;

    public static void isExist(int a, int b) {
        if((a + b) < 180) {
            System.out.println("Exist.");
            if(((a + b) == 90) || (a == 90) || (b == 90)) {
                System.out.println("Rectangular angle.");
            }
        } else {
            System.out.println("Does not exist.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            scanner.next();
        }

        a = scanner.nextInt();

        while (!scanner.hasNextInt()) {
            scanner.next();
        }

        b = scanner.nextInt();

        isExist(a, b);
    }
}
