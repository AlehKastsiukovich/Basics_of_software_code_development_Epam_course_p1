package Linear;

public class Task1 {
    private int a;
    private int b;
    private int c;
    private int z;

    public Task1(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int function() {
        return ((a-3) * b/2) + c;
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1(4,3,2);
        task1.z = task1.function();
    }
}


