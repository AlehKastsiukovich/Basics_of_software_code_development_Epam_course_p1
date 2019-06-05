package Linear;

public class Task5 {
    public static void main(String[] args) {
        int timeInSec = 10000;
        int hh = timeInSec/3600;
        int hhMod = timeInSec%3600;
        int mm = hhMod/60;
        int sec = hhMod%60;

        System.out.println(hh + "ч " + mm + "мин " + sec +"c");
    }
}
