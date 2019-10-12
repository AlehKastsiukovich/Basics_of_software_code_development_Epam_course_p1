package by.etc.bscd.branches;


import java.util.Scanner;

/**
 * Даны два угла треугольника (в градусах). Определить существует ли такой треугольник
 * и если да, то будет ли он прямоугольным.
 */


public class Task1 {
    private static int a;
    private static int b;
    private static Scanner scanner = new Scanner(System.in);

    public static void function(int a, int b) {
        if((a + b) < 180) {
            System.out.println("Существует.");
            if(((a + b) == 90) || (a == 90) || (b == 90)) {
                System.out.println("Прямоугольный.");
            }
        } else {
            System.out.println("Не существует.");
        }
    }

    public static void main(String[] args) {
        a = scanner.nextInt();
        b = scanner.nextInt();

        function(a, b);
    }
}
