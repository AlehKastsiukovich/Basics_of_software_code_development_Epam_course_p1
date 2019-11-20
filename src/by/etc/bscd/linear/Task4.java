package by.etc.bscd.linear;


import java.util.Scanner;

/**
Дано действительное число R вида nnn.ddd/ Поменять местами дробную и целую часть.
 */

public class Task4 {
    private static float after;
    private static float before;

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextFloat()) {
            scanner.next();
        }

        after = scanner.nextFloat();
        System.out.println("After modification: " + after);

        int temp1 = (int) after;
        System.out.println(temp1);

        int temp2 = (int) ((after - temp1) * 1000);
        System.out.println(temp2);

        before = temp2 + temp1 * 0.001f;

        System.out.println("Before modification: " + before);
    }
}
