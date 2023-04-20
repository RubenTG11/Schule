package arbeitsblatt11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arbeitsblatt_11_7b {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Gebe einen Endwert an: ");
            int endValue = scanner.nextInt();

            System.out.println(sumUpSequence(endValue*2));
        } catch (InputMismatchException e){
            System.out.println("Du musst eine Ganzzahl eingeben!");
        }
    }

    private static double sumUpSequence(int end){
        if(end == 2) return 4;
        return (end*end) + sumUpSequence(end-2);
    }
}
