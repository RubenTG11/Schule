import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DateToDay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dateInput = scanner.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.ENGLISH);

        if(formatter.parse(dateInput) == null) return;

        LocalDate date = LocalDate.parse(dateInput, formatter);

        System.out.println(date.getDayOfWeek().getDisplayName(TextStyle.NARROW, Locale.GERMAN));
    }
}
