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
    private static Scanner scanner = new Scanner(System.in);

    public static int findMax() {
        int minAb = a < b ? a : b;
        int minCd = c < d ? c : d;
        int max = minAb > minCd ? minAb : minCd;
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Enter a: ");
        a = scanner.nextInt();
        System.out.println("Enter b: ");
        b = scanner.nextInt();
        System.out.println("Enter c: ");
        c = scanner.nextInt();
        System.out.println("Enter d: ");
        d = scanner.nextInt();

        System.out.println("Max value is " + findMax());
    }
}
