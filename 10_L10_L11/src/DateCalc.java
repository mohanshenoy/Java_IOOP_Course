import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateCalc {
    public static void main(String[] args) {
        // 1. Get the current date
        int month, year;
        String dayName, Month;
        LocalDate today = LocalDate.now();
        dayName = today.getDayOfWeek().toString(); // gives day name
        Month = today.getMonth().toString(); // gives month name
        year = today.getYear();
        
        System.out.println("Today's Date: " + today);
        System.out.println("Today's Day***: " + dayName);
        System.out.println("Today's Month***: " + Month);

        // 2. Add 10 days to the current date
        LocalDate futureDate = today.plusDays(10);
        System.out.println("Date After 10 Days: " + futureDate);

        // 3. Add 2 weeks to the current date
        LocalDate futureWeek = today.plusWeeks(2);
        System.out.println("Date After 2 Weeks: " + futureWeek);

        // 4. Add 3 months to the current date
        LocalDate futureMonth = today.plusMonths(3);
        System.out.println("Date After 3 Months: " + futureMonth);

        // 5. Calculate the difference in days between two dates
        LocalDate startDate = LocalDate.of(2025, 1, 1);
        LocalDate endDate = LocalDate.of(2025, 12, 31);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("Days Between " + startDate + " and " + endDate + ": " + daysBetween);
    }
}