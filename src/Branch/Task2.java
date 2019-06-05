package Branch;

public class Task2 {
    int a;
    int b;
    int c;
    int d;

    public int findMax() {
        int minAb = a < b ? a : b;
        int minCd = c < d ? c : d;
        int max = minAb > minCd ? minAb : minCd;
        return max;
    }
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.findMax();
    }
}
