package Branch;

public class Task4 {
    int a;
    int b;
    int x;
    int y;
    int z;

    public void function() {
        if (((a > x) && (b > y)) || ((a > y) && (b > x))||((a > x) && (b > z))||((a > z) && (b > y))) {
            System.out.println("Кирпич пройдет");
        } else {
            System.out.println("Кирпич не пройдет");
        }
    }
    public static void main(String[] args) {
        Task4 task4 = new Task4();
        task4.function();
    }
}
