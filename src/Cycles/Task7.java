package Cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(bufferedReader.readLine());
        int n = Integer.parseInt(bufferedReader.readLine());

        if (m > 0 && n > 0 && m < n) {

            for (int i = m; i <= n; i++) {
                for (int j = 2; j <= n; j++) {
                    if ((i % j == 0) && (i != j)) {
                        System.out.println("Число: " + i + " делитель: " + j);
                    }
                }
            }
        } else {
            System.out.println("Введенный промежуток не верный.");
        }
    }
}
