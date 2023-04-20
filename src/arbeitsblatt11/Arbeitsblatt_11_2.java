package arbeitsblatt11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arbeitsblatt_11_2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Gebe die untere Grenze ein: ");

            int low = scanner.nextInt();

            System.out.print("Gebe die obere Grenze ein: ");

            int high = scanner.nextInt();

            if(low >= high) {
                System.out.println("Die untere Grenze muss echt kleiner als die obere Grenze sein!");
                return;
            }

            for (int i = low; i < high; i++) {
                if((i % 2) == 1){
                    System.out.println(i);
                }
            }
        } catch (InputMismatchException e){
            System.out.println("Bitte gebe eine Ganzzahl an!");
        }


    }
}
