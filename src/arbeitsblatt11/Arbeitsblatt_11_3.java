package arbeitsblatt11;

import java.util.Scanner;

public class Arbeitsblatt_11_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gebe eine reele Basis ein (x): ");

        double basis = scanner.nextDouble();

        System.out.print("Gebe einen natürlichen Exponenten ein (n): ");

        int exponent = scanner.nextInt();

        // Lösung mit Mathe Bibliothek

        System.out.println("Lösung x^n: " +Math.pow(basis, exponent));

        // Lösung mit for Schleife

        double potenz = basis;

        for (int i = 1; i <= exponent-1 ; i++) {
            potenz = potenz * basis;
        }

        System.out.println("Lösung x^n mit Schleife: "+potenz);
    }
}
