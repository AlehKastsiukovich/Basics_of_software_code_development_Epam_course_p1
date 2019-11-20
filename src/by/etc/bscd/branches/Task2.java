package by.etc.bscd.branches;


import java.util.Scanner;

/**
 * Найти max{min(a,b), min(c,d)}
 */

public class Task2 {
    private static int a;
    private static int b;
    private static int c;
    private static int d;

    public static int findMax() {
        int minAb = a < b ? a : b;
        int minCd = c < d ? c : d;
        int max = minAb > minCd ? minAb : minCd;
        return max;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        a = scanner.nextInt();

        System.out.println("Enter b: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        b = scanner.nextInt();

        System.out.println("Enter c: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        c = scanner.nextInt();

        System.out.println("Enter d: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        d = scanner.nextInt();

        System.out.println("Max value is " + findMax());
    }
}
