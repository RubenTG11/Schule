import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Arbeitsblatt_7 {
    private static Map<String, String> seasons = new HashMap<>();

    static {
        seasons.put("januar", "Winter");
        seasons.put("februar", "Winter");
        seasons.put("märz", "Frühling");
        seasons.put("april", "Frühling");
        seasons.put("mai", "Frühling");
        seasons.put("juni", "Frühling");
        seasons.put("juli", "Sommer");
        seasons.put("august", "Sommer");
        seasons.put("september", "Sommer");
        seasons.put("oktober", "Herbst");
        seasons.put("november", "Herbst");
        seasons.put("dezember", "Winter");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welche Aufgabe? >> ");

        int exercise = scanner.nextInt();

        switch (exercise){
            case 1:
                System.out.println("Gebe die Seitenlängen a, b, und c an. z.B. 10:13:15");
                System.out.print(">> ");
                String next = scanner.next();
                String[] sides = next.replace(" ", "").split(":");

                if(sides.length < 3) {
                    System.out.println(next);
                    System.out.println(sides.length);
                    System.out.println("Du hast nicht alle Seiten angegeben!");
                    return;
                }

                int a = Integer.valueOf(sides[0]);
                int b = Integer.valueOf(sides[1]);
                int c = Integer.valueOf(sides[2]);

                System.out.println(constructTriangle(a, b, c));
                break;
            case 2:
                System.out.println("Wie viel Umsatz hat der Vertreter gemacht?");
                System.out.print(">> ");

                double salesVolume = scanner.nextDouble();

                System.out.println(provision(salesVolume, 10));
                break;
            case 3:
                System.out.print("Gebe den Monat an: ");
                String month = scanner.next();
                System.out.println(getSeason(month));

                break;
            default:
                System.out.println("Das ist eine ungültige Eingabe!");
        }

        scanner.close();
    }

    private static String constructTriangle(double a, double b, double c){
        return ((a+b)>c && (a+c)>b && (b+c)>a)
                ? "Dreieck kann konstruiert werden"
                : "Dreieck kann nicht konstruiert werden";
    }

    private static String provision(double salesVolume, double provisionPercentage){
        return salesVolume > 10_000
                ? "Der Vertreter erhält " + (salesVolume * (provisionPercentage/100)) + " Provision"
                : "Der Vertreter erhält keine Provision";
    }

    private static String getSeason(String month){
        return seasons.containsKey(month.toLowerCase())
                ? "Es ist " + seasons.get(month) + "!"
                : "Ungültige Eingabe!";
    }
}
