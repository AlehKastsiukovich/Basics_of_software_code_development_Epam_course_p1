package by.etc.bscd.linear;

import java.util.Scanner;

/**
Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
Вывести данное время в HHч ММмин SSс.
 */

public class Task5 {
    private static Scanner scanner = new Scanner(System.in);
    private static int timeSec;

    public static void main(String[] args) {
        System.out.println("Enter time in seconds: ");
        timeSec = scanner.nextInt();

        int hh = timeSec/3600;
        int hhMod = timeSec%3600;
        int mm = hhMod/60;
        int sec = hhMod%60;

        System.out.printf("%02dч %02dмин %02dс" , hh, mm, sec);
    }
}
