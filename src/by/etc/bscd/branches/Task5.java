package by.etc.bscd.branches;


import java.util.Scanner;

/**
 * Вычислить значение функции F(x) = Math.pow(x, 2) - 3 * x + 9 при x <= 3 и
 * F(x) = 1 / (Math.pow(x, 3) + 6) при x > 3.
 */

public class Task5 {
    private static double x;
    private static double result;
    private static Scanner scanner = new Scanner(System.in);

    public static double function() {
        if (x <= 3) {
            result = Math.pow(x, 2) - 3 * x + 9;
        } else if (x > 3) {
            result = 1 / (Math.pow(x, 3) + 6);
        }
        return result;
    }

    public static void main(String[] args) {
        x = scanner.nextDouble();

        System.out.println(function());
    }
}
