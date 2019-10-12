package by.etc.bscd.cycles;


import java.util.Scanner;

/**
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера
 */

public class Task6 {

    public static void function(char c) {
        System.out.println("Символ: "+ c +" и его численное обозначение: " + (int)c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);

        function(c);
    }
}
