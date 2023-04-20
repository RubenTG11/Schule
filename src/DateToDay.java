import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DateToDay {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.ENGLISH);
    public static void main(String[] args) {

        // determine date by input
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(LocalDate.parse(scanner.next(), FORMATTER).getDayOfWeek().getDisplayName(TextStyle.NARROW, Locale.GERMAN));
        } catch (DateTimeParseException e){
            System.out.println("Bitte gebe ein gültiges Datum ein!");
        }

    }
}
