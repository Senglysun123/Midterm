import java.text.DateFormatSymbols;
import java.util.Scanner;

public class ShortDateConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();

        // Split the short date into year, month, and day
        String[] dateParts = shortDate.split("-");
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);

        // Convert month number to month name
        String monthName = new DateFormatSymbols().getMonths()[month - 1];

        // Display the full date representation
        String fullDate = monthName + " " + day + ", " + year;
        System.out.println("Full date: " + fullDate);

        scanner.close();
    }
}