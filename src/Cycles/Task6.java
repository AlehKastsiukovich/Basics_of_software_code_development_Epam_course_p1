package Cycles;

public class Task6 {
    char character;

    Task6(char character) {
        this.character = character;
    }

    public static void function(char c) {
        System.out.println("Символ: "+ c +" и его численное обозначение: " + (int)c);
    }
    public static void main(String[] args) {
        function('c');
    }
}
