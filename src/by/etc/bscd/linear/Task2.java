package by.etc.bscd.linear;

/**
Вычислить значение выражения по формуле(все переменные принимают действительные значения)
 */

public class Task2 {

    public static double function(double a, double b, double c) {
        return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c))/(2 * a)
                - Math.pow(a, 3) * c + Math.pow(b, -2);
    }

    public static void main(String[] args) {
        double result = function(2.0, 2.0, 5.0);

        System.out.println(result);
    }
}
