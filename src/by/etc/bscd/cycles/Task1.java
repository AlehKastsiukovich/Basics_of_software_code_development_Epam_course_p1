package by.etc.bscd.cycles;


import java.util.Scanner;

/**
 * Пользователь вводит любое положительное число. А программа суммирует все числа от
 * 1-го до этого числа.
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");

        int number = 0;
        while(true) {
            number = scanner.nextInt();

            if (number >= 1) {
                break;
            }
        }

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
