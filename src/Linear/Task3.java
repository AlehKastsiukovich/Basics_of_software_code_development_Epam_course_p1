package Linear;

public class Task3 {
    private double x;
    private double y;

    Task3(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double function() {
        return ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3(0.1, 0.2);
        double result = task3.function();
    }
}
