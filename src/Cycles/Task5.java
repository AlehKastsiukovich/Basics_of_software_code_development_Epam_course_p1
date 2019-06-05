package Cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    private static double n;
    private static double a;
    private static double e;
    private static double sum = 0.0;

    public static void function() {
        while (true) {
                a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
                if (Math.abs(a) >= e) {
                sum += a;
                n++;
            } else {
                    System.out.println("Сумма членов ряда: "+sum);
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        n = Double.parseDouble(bufferedReader.readLine());
        e = Double.parseDouble(bufferedReader.readLine());

        function();
    }
}
