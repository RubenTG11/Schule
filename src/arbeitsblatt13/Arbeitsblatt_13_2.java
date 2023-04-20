package arbeitsblatt13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arbeitsblatt_13_2 {
    public static void main(String[] args) {
        int number;

        try(Scanner scanner = new Scanner(System.in)) {
            StringBuilder stringBuilder = new StringBuilder();

            System.out.print("Geben Sie eine ganze Zahl ein: ");
            number = scanner.nextInt();

            stringBuilder.append(number+" ist durch ");

            for(int i = 1; i <= number; i++){
                if((number % i) == 0) stringBuilder.append(i+" ");
            }

            stringBuilder.append("teilbar.");

            System.out.println(stringBuilder);
        } catch (InputMismatchException e) {
            System.out.println("Du musst eine Ganzzahl angeben!");
        }
    }
}
