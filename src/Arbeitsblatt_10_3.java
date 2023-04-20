import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Arbeitsblatt_10_3 {

    private static final Map<Double, Double> prices = Map.of(
            20.0, 1.00,
            50.0, 1.70,
            100.0, 2.40,
            250.0, 3.20,
            500.0, 4.00,
            1000.0, 4.80
    );
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Portoberechnung");
            System.out.print("Gewicht des Briefs in g: ");

            int weight = scanner.nextInt();

            if(weight > 1000){
                System.out.println("Du musst dein 'Brief' als Pächen verschicken!");
                return;
            }

            List<Double> weightGroups = prices.keySet().stream().sorted().toList();

            for(int i = 0; i < prices.size(); i++){
                double weightGroup = weightGroups.get(i);
                System.out.println(weightGroup);
                if(weight <= weightGroup){
                    System.out.println("Kosten: "+prices.getOrDefault(weightGroup, 0.0)+"$");
                    return;
                }
            }
        } catch (InputMismatchException e){
            System.out.println("Bitte gebe eine Ganzzahl an!");
        }





    }
}
