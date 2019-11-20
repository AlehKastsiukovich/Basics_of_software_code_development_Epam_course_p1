package by.etc.bscd.cycles;


import java.util.Scanner;
import java.util.TreeSet;

/**
 * Даны два числа. Определить цифры входящие в запись как первого так и второго числа.
 */

public class Task8 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers : ");

        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        int firstNum = scanner.nextInt();

        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        int secondNum = scanner.nextInt();

        String firstNumStr = String.valueOf(firstNum);
        String secondNumStr = String.valueOf(secondNum);

        char [] firsNumArray = firstNumStr.toCharArray();
        char [] secondNumArray = secondNumStr.toCharArray();
        TreeSet<Character> treeSet = new TreeSet<>();

        for (char i = 0; i<firsNumArray.length; i++) {
            for (char j = 0; j < secondNumArray.length; j++) {
                if (firsNumArray[i] == secondNumArray[j]) {
                    treeSet.add(firsNumArray[i]);
                }
            }
        }
        System.out.println("Цифры входящие в запись первого и второго числа:");
        for (Character ch : treeSet) {
            System.out.println(ch);
        }

    }
}
