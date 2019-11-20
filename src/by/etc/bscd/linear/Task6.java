package by.etc.bscd.linear;


import java.util.Scanner;

/**
Для данной области составить линейную программу, которая печатает true
если точка с координатами (x,y) принадлежит закрашенной области и false в противном случае.
 */

public class Task6 {
    private static int x;
    private static int y;

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x then y: ");

        while (!scanner.hasNextInt()) {
            scanner.next();
        }

        x = scanner.nextInt();
        y = scanner.nextInt();

        if ((x >= -4) && (x <= 4) && (y >= -3) && (y <= 4)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
