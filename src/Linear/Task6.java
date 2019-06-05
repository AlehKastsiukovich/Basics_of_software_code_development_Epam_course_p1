package Linear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите х: ");
        int x = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Введите y: ");
        int y = Integer.parseInt(bufferedReader.readLine());

        if (((x >= -4)&&(x <= 4))&&((y >= -3)&&(y <= 4))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
