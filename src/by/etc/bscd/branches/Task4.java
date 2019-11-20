package by.etc.bscd.branches;


/**
 * Заданы размеры А B прямоугольного отверстия. Определить пройдет ли кирпич (x,y,z) в отверствие.
 */

public class Task4 {
    private static int a;
    private static int b;
    private static int x;
    private static int y;
    private static int z;


    public static boolean isPenetrate() {
        if (((a > x) && (b > y)) || ((a > y) && (b > x))
                || ((a > x) && (b > z)) || ((a > z) && (b > y))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        a = 5;
        b = 10;

        x = 2;
        y = 3;
        z = 3;

        System.out.println(isPenetrate());
    }
}
