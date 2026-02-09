
public class Date {
    	private int day, month, year;
    private static final int[] DAYS_IN_MONTH = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	    public Date(int day, int month, int year) {
	        this.day = day;
	        this.month = month;
	        this.year = year;
	    }

    private boolean isLeap(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }

    public void display() {
        //
    }

    public void addOneDay() {
        int maxDays = (month == 2 && isLeap(year)) ? 29 : DAYS_IN_MONTH[month];
        if (++day > maxDays) {
            day = 1;
            if (++month > 12) {
                month = 1;
                year++;
            }
        }
    }

    // Helper to convert date to total days since year 0 for easy subtraction
    private long toTotalDays() {
        long total = year * 365L + (year / 4) - (year / 100) + (year / 400);
        for (int i = 1; i < month; i++) total += DAYS_IN_MONTH[i];
        if (month > 2 && isLeap(year)) total++;
        return total + day;
    }

    public static long daysBetween(Date d1, Date d2) {
        return Math.abs(d1.toTotalDays() - d2.toTotalDays());
    }

    public static void main(String[] args) {
        Date today = new Date(31, 1, 2026);
        System.out.print("Current Date: ");
        today.display();

        today.addOneDay();
        System.out.print("Next Date: ");
        today.display();
    }
}