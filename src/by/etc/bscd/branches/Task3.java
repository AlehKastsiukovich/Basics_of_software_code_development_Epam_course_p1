package by.etc.bscd.branches;


import java.util.Scanner;

/**
 * Даны три точки А(x1, y1), B(x2, y2), C(x3, y3). Определить будут ли они расположены на одной прямой
 */

public class Task3 {
    private static int x1;
    private static int y1;
    private static int x2;
    private static int y2;
    private static int x3;
    private static int y3;
    private static Scanner scanner = new Scanner(System.in);

    public static void function() {
        if((x1 - x3) * (y2 - y3) == (x2 - x3) * (y1 - y3)) {
            System.out.println("Points are on the same line");
        } else {
            System.out.println("Points are not  on the same line");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter A coordinates x the y: ");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();

        System.out.println("Enter B coordinates x the y: ");
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();

        System.out.println("Enter C coordinates x the y: ");
        x3 = scanner.nextInt();
        y3 = scanner.nextInt();

        function();
    }
}
