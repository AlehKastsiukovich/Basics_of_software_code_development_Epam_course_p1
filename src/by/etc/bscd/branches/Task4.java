package by.etc.bscd.branches;


import java.util.Scanner;

/**
 * Заданы размеры А B прямоугольного отверстия. Определить пройдет ли кирпич (x,y,z) в отверствие.
 */

public class Task4 {
    private static int a;
    private static int b;
    private static int x;
    private static int y;
    private static int z;
    private static Scanner scanner = new Scanner(System.in);

    public static void function() {
        if (((a > x) && (b > y)) || ((a > y) && (b > x))
                || ((a > x) && (b > z)) || ((a > z) && (b > y))) {
            System.out.println("enter");
        } else {
            System.out.println("not enter");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a: ");
        a = scanner.nextInt();

        System.out.println("Enter b: ");
        b = scanner.nextInt();

        System.out.println("Enter x: ");
        x = scanner.nextInt();

        System.out.println("Enter y: ");
        y = scanner.nextInt();

        System.out.println("Enter z: ");
        z = scanner.nextInt();

        function();
    }
}
