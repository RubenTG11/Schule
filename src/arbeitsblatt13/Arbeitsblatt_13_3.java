package arbeitsblatt13;

import java.util.Random;
import java.util.Scanner;

public class Arbeitsblatt_13_3 {
    public static void main(String[] args) {
        int random = new Random().nextInt(100)+1;
        if(random > 10) throw new IllegalArgumentException("Unzulässiger  random!");
        int eingabe;
        int versuch = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Errate die Zahl ("+(versuch+1)+". Versuch): ");
            eingabe = scanner.nextInt();
            versuch++;
        } while (eingabe != random);

        System.out.println("Herzlichen Glückwunsch, du hast die Zahl erraten!");
    }
}
