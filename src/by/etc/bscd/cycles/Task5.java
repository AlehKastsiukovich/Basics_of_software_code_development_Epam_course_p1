package by.etc.bscd.cycles;


import java.util.Scanner;

/**
 * Дан числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше
 * или равен заданному е. Общий член ряда имеет вид a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n))
 */

public class Task5 {
    private static double n;
    private static double a;
    private static double e;
    private static double sum;

    public static void findSum() {
        while (true) {
            a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));

            if (Math.abs(a) >= e) {
                sum += a;
                n++;
            } else {
                System.out.println("Sum of numerical series: " + sum);
                break;
            }
        }
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextDouble()) {
            scanner.next();
        }

        n = scanner.nextDouble();

        while (!scanner.hasNextDouble()) {
            scanner.next();
        }

        e = scanner.nextDouble();

        findSum();
    }
}
