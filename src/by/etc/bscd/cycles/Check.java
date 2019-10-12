package by.etc.bscd.cycles;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        String astring = String.valueOf(a);
        String bstring = String.valueOf(b);

        char [] aArray = astring.toCharArray();
        char [] bArray = bstring.toCharArray();


        for (int i = 0; i < aArray.length; i++) {
            int count = 0;


            for (int j = 0; j < bArray.length; j++) {
                if (aArray[i] == bArray[j]) {
                    System.out.println(aArray[i]);

                }
            }
        }
    }
}
