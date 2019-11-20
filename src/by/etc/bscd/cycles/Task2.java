package by.etc.bscd.cycles;


import java.util.Scanner;

/**
 * Вычислить значение функции f(x) = x при x>2, -x при x <= 2 на отрезке [a,b] с шагом h.
 */

public class Task2 {
    private static int a;
    private static int b;
    private static int h;


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
        @SuppressWarnings("resouce")
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
        }

        a = scanner.nextInt();

        System.out.println("enter b: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
        }

        while (true) {
            b = scanner.nextInt();
            if (b >= a) {
                break;
            }
        }

        System.out.println("enter h: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
        }

        h = scanner.nextInt();

        function();
    }
}