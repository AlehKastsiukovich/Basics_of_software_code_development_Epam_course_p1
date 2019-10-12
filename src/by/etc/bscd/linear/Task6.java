package by.etc.bscd.linear;


import java.util.Scanner;

/**
Для данной области составить линейную программу, которая печатает true
если точка с координатами (x,y) принадлежит закрашенной области и false в противном случае.
 */

public class Task6 {
    private static int x;
    private static int y;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите х: ");
        x = scanner.nextInt();
        System.out.println("Введите y: ");
        y = scanner.nextInt();

        if ((x >= -4) && (x <= 4) && (y >= -3) && (y <= 4)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
