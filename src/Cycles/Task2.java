package Cycles;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    static List <Integer> list1 = new ArrayList<>();
    static List <Integer> list2 = new ArrayList<>();

    public static void function(int a, int b, int h) {
        for (int i = a; i <= b ; i = i+h) {
            if (i > 2) {
                list1.add(i);
            }
            if (i <= 2) {
                list2.add(-i);
            }
        }
    }

    public static void main(String[] args) {
        function(-5,5,1);

        System.out.println("Значения функции при x > 2: "+list1);
        System.out.println("Значение фунции при x <= 2: "+list2);
    }
}