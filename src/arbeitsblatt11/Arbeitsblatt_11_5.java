package arbeitsblatt11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arbeitsblatt_11_5 {

    public static void main(String[] args) {


        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Gib die Anzahl der Zeilen ein: ");

            int rows = scanner.nextInt();

            // Gebe den Baum aus
            for (int i = 0; i < rows; i++) {
                int stars = (i == 0 ? 1 : i*2+1);
                int spaces = (((rows*2)-1) - stars) / 2;

                System.out.println(" ".repeat(spaces) + "*".repeat(stars) + " ".repeat(spaces));
            }

            // Gebe den Stamm aus
            int spaces = (((rows*2)-1)-1) / 2;
            System.out.println(" ".repeat(spaces) + "I" + " ".repeat(spaces));
        } catch (InputMismatchException e){
            System.out.println("Du musst eine Ganzzahl angeben!");
        }


    }
}
