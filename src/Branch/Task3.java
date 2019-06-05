package Branch;

public class Task3 {
    int x1;
    int y1;
    int x2;
    int y2;
    int x3;
    int y3;

    public void function() {
        if((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            System.out.println("Точки расположены на одной прямой");
        } else {
            System.out.println("Точки не расположены на одной прямой");
        }
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.function();
    }
}
