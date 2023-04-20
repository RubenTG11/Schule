import java.util.InputMismatchException;
import java.util.Scanner;

public class Arbeitsblatt_10_Extra {
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Gib das Jahr des Osterns ein: ");

            int j = scanner.nextInt();

            int a = j % 19;
            int b = j % 4;
            int c = j % 7;
            int m = (8 * (j / 100) + 13) / 25 - 2;
            int s = j / 100 - j / 400 - 2;
            m = (15 + s - m) % 30;
            int n = (6 + s) % 7;

            int d = (m + 19 * a) % 30;

            if (d == 29) {
                d = 2;
            } else if (d == 28 && a >= 11) {
                d = 27;
            }

            int e = (2 * b + 4 * c + 6 * d + n) % 7;

            int tag = 21 + d + e + 1;
            int monat = 0;
            if (tag > 31) {
                tag = tag % 31;
                monat = 4;
            } else {
                monat = 3;
            }

            System.out.println("Im Jahr " + j + " ist der Ostersonntag am " + tag + "." + monat);

        } catch (InputMismatchException e) {
            System.out.println("Bitte gebe eine ganze Zahl an!");
        }


    }
}
