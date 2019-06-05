package Branch;

public class Task1 {

    public void function(int a, int b) {
        if((a + b) < 180) {
            System.out.println("Существует.");
            if((a + b) == 90) {
                System.out.println("Прямоугольный.");
            }
        } else {
            System.out.println("Не существует.");
        }
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.function(30,60);
    }
}
