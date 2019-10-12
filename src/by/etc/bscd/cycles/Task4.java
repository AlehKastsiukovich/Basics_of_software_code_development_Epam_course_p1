package by.etc.bscd.cycles;

/**
 * Составить программу нахождения произведения квадратов первых 200-т чисел
 */

public class Task4 {
    public static void main(String[] args) {
        long multiplication = 1;

        for (int i = 2; i <= 200; i++) {
            multiplication *= Math.pow(i, 2);
        }

        System.out.println(multiplication);
    }
}
