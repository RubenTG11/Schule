import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Arbeitsblatt_10_5 {

    private static final Map<Integer, String> DAYS_TO_NAMES = Map.of(
            0, "Sonntag",
            1,"Montag",
            2,"Dienstag",
            3,"Mittwoch",
            4,"Donnerstag",
            5,"Freitag",
            6,"Samstag"
    );
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Gebe den Tag ein: ");
            int t = scanner.nextInt();
            System.out.print("Gebe den Monat ein: ");
            int m = scanner.nextInt();
            System.out.print("Gebe das Jahr ein: ");
            int j = scanner.nextInt();

            if(m <= 2) {
                m = m+10;
                j--;
            }else{
                m -= 2;
            }

            int c = j/100;
            int y = j%100;
            int h = (((26*m-2)/10) + t + y + y/4 + c/4 - 2*c) % 7;

            System.out.println(h);

            if(h < 0) h = h+7;


            System.out.println("Der  "+t+"."+m+"."+y+" ist ein "+DAYS_TO_NAMES.getOrDefault(h, "Es ist ein Fehler unterloffen!"));
        }catch (InputMismatchException e){
            System.out.println("Bitte gebe ausschließlich Ganzzahlen an!");
        }

    }
}
