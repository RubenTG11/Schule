import java.util.Scanner;

public class Arbeitsblatt_10_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte Geben sie den Typ des Körpers aus (Zylinder, Würfel, Quader): ");
        String type = scanner.next().split("")[0].toUpperCase();

        double volume = 0;
        double surface = 0;

        switch (type){
            case "Z" -> {
                System.out.print("Gebe den Radius in cm an: ");
                double radius = scanner.nextDouble();
                System.out.print("gebe die Höhe in cm an: ");
                double height = scanner.nextDouble();

                volume = Math.PI * radius * radius * height;
                surface = 2 * Math.PI * radius * (radius+height);
            }
            case "W" -> {
                System.out.print("Gebe die Kantenlänge in cm an: ");
                double length = scanner.nextDouble();

                volume = length * length * length;
                surface = 6 * (length * length);
            }
            case "Q" -> {
                System.out.print("Gebe die Länge in cm an: ");
                double length = scanner.nextDouble();
                System.out.print("Gebe die Breite in cm an: ");
                double width = scanner.nextDouble();
                System.out.print("Gebe die Höhe in cm an: ");
                double height = scanner.nextDouble();

                volume = length * width * height;
                surface = 2*length*width+2*length*height+2*width*height;

            }
            default -> {
                volume = 1000;
                surface = 1000;
            }
        }

        System.out.println("Das Volumen: "+volume+" cm*cm*cm");
        System.out.println("Die Oberfläche: "+surface+" cm*cm");



    }



}
