package Linear;

public class Task2 {
    private double a;
    private double b;
    private double c;

    public Task2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double function() {
        return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c))/2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2(2.0,3.0,4.0);
        double result = task2.function();
    }
}
