package by.etc.bscd.cycles;


import java.util.Scanner;

/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме 1 и самого числа.
 */

public class Task7 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            scanner.next();
        }

        int m = scanner.nextInt();

        while (!scanner.hasNextInt()) {
            scanner.next();
        }

        int n = scanner.nextInt();

        if (m > 0 && n > 0 && m < n) {

            for (int i = m; i <= n; i++) {
                for (int j = 2; j <= n; j++) {
                    if ((i % j == 0) && (i != j)) {
                        System.out.println("Number: " + i + " Divisor: " + j);
                    }
                }
            }
        } else {
            System.out.println("Wrong interval.");
        }
    }
}
