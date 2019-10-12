package by.etc.bscd.linear;


import java.util.Scanner;

/**
Дано действительное число R вида nnn.ddd/ Поменять местами дробную и целую часть.
 */

public class Task4 {
    private static Scanner scanner = new Scanner(System.in);
    private static float after;
    private static float before;

    public static void main(String[] args) {
        after = scanner.nextFloat();
        System.out.println("After modification: " + after);

        float temp1 = (int) after;
        float temp2 = temp1 * 0.001f;
        float temp3 = 0.333f * 1000;

        before = temp3 + temp2;
        System.out.println("Before modification: " + before);
    }
}
