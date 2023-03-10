import java.util.Map;
import java.util.Scanner;

public class Arbeitsblatt_10_4 {
    public static void main(String[] args) {
        Map<Integer, Double> prices = Map.of(
                7, 28.0,
                8,28.5,
                9,39.0,
                10,70.0,
                11,120.5
        );

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wann kaufst du die Karten: ");
        int hour = scanner.nextInt();

        if(hour > 11 || hour < 7){
            System.out.println("Der Shop ist geschlossen!");
            return;
        }

        System.out.println("Das Ticket kostet "+prices.get(hour)+"€");
    }
}
