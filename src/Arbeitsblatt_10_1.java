import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class Arbeitsblatt_10_1 {

    private final static Map<Integer, String> grades = Map.of(
            1, "sehr gut",
            2, "gut",
            3, "befriedigend",
            4, "ausreichend",
            5, "mangelhaft",
            6, "ungenügend"
    );
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Deine Note: ");

            int grade = scanner.nextInt();

            System.out.println(grades.getOrDefault(grade, "Diese Note existiert nicht!"));

            switch (grade){
                case 1,2 -> System.out.println("Sie erbringen gute Leistungen");
                case 3,4 -> System.out.println("Sie erbringen durchschnittliche Leistungen");
                case 5,6 -> System.out.println("Ihre Leistungen sind zu schlecht.");
                default -> System.out.println("Diese Note existiert nicht!");
            }
        } catch (InputMismatchException e){
            System.out.println("Du musst eine Ganzzahl angeben1");
        }

    }
}
