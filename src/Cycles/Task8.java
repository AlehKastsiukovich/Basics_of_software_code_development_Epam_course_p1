package Cycles;

import java.util.TreeSet;

public class Task8 {
    public static void main(String[] args) {
        int firstNum = 500299;
        int secondNum = 3509;

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
