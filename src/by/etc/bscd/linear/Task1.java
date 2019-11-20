package by.etc.bscd.linear;

/**
Найти значение функции z = ((a-3) * b/2) + c
 */

public class Task1 {
    private static int a;
    private static int b;
    private static int c;
    private static int z;

    public static void function(int a, int b, int c) {
        z = ((a-3) * b/2) + c;
    }

    public static void main(String[] args) {
        a = 5;
        b = 5;
        c = 5;

        function(a, b, c);
        System.out.println(z);
    }
}


