package Cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        int sum = 0;

        if(number >= 1) {
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            System.out.println(sum);
        } else {
            System.out.println("Вы ввели не положительное число");
        }
    }
}
