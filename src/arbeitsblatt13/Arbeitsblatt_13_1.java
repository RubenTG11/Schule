package arbeitsblatt13;

import java.util.Scanner;

public class Arbeitsblatt_13_1 {
    public static void main(String[] args) {
        double eingabe;
        double sum = 0;
        int summands = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Gib eine Zahl ein (Beenden mit 0): ");
            eingabe = scanner.nextDouble();
            sum += eingabe;

            if(eingabe != 0) summands++;
        } while (eingabe != 0);

        System.out.println("Summe: "+sum+"; Durchschnitt: "+(sum/(summands==0 ? 1 : summands)));
    }
}
