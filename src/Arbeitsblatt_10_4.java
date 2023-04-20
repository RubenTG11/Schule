import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Arbeitsblatt_10_4 {

    private static final Map<Integer, Double> PRIZES = Map.of(
            7, 28.0,
            8,28.5,
            9,39.0,
            10,70.0,
            11,120.5
    );
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Wann kaufst du die Karten: ");
            int hour = scanner.nextInt();

            if(hour > 11 || hour < 7){
                System.out.println("Der Shop ist geschlossen!");
                return;
            }

            System.out.println("Das Ticket kostet "+PRIZES.get(hour)+"€");
        } catch (InputMismatchException e){
            System.out.println("Bitte gebe eine Ganzzahl an!");
        }
    }
}
