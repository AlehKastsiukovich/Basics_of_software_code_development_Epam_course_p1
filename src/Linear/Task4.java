package Linear;

public class Task4 {
    public static void main(String[] args) {
        double number = 333.444;
        String numberToString = Double.toString(number);
        String [] array = numberToString.split("\\.");
        String newNumber = array[1]+"."+array[0];
        double result = Double.parseDouble(newNumber);

        System.out.println(result);
    }
}
