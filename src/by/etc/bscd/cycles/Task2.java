package by.etc.bscd.cycles;


import java.util.Scanner;

/**
 * Вычислить значение функции f(x) = x при x>2, -x при x <= 2 на отрезке [a,b] с шагом h.
 */

public class Task2 {
    private static int a;
    private static int b;
    private static int h;
    private static Scanner scanner = new Scanner(System.in);

    public static void function() {
        for (int i = a; i <= b; i = i + h) {
            if (a > 2) {
                System.out.println("x > 2: value = " + i);
            } else if (a <= 2) {
                System.out.println("x <= 2: value is = " + -i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("enter a: ");
        a = scanner.nextInt();

        System.out.println("enter b: ");
        while (true) {
            b = scanner.nextInt();
            if (b >= a) {
                break;
            }
        }

        System.out.println("enter h: ");
        h = scanner.nextInt();

        function();
    }
}