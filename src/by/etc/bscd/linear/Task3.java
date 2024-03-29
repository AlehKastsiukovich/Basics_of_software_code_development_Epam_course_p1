package by.etc.bscd.linear;

/**
 * Вычислить значение выражения по формуле. (Все переменные принимают действительные значения)
 * (sinx + cosx)/(cosx - sinx) * tgxy
*/

import java.util.Scanner;


public class Task3 {
    private static double x;
    private static double y;

    public static double function(double x, double y) {
        return ((Math.sin(Math.toRadians(x)) + Math.cos(Math.toRadians(y)))
                / (Math.cos(Math.toRadians(x)) - Math.sin(Math.toRadians(y))))
                * Math.tan(x * y);
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter angle: ");

        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.println("Enter angle: ");
        }

        x = scanner.nextDouble();
        y = scanner.nextDouble();

        System.out.println(function(x, y));
    }
}
