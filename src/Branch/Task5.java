package Branch;

public class Task5 {
    double x;
    double result;

    public double function() {
        if (x <= 3) {
            result = Math.pow(x,2) - 3 * x + 9;
        }
        if (x > 3) {
            result = 1/(Math.pow(x,3) + 6);
        }
        return result;
    }
    public static void main(String[] args) {
        Task5 task5 = new Task5();
        task5.function();
    }
}
