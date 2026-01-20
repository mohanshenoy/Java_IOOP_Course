enum Day {
    MONDAY(true), TUESDAY(true),WEDNESDAY(true), THURSDAY(true),FRIDAY(true), 
    SATURDAY(false), SUNDAY(false);
	
    private final boolean isWeekday;
    
    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }
    public boolean isWeekday() {
        return isWeekday;
    }
}
public class Example6 {
	public static void main(String[] args) {
		Day today = Day.MONDAY;
		String result = switch (today) {
		    case SATURDAY, SUNDAY -> "It's the weekend! :)";
		    default -> "It's a weekday :(";
		};
		System.out.println(today.isWeekday());
		for (Day day : Day.values()) {
			System.out.println(day + "is a "+ (day.isWeekday()?"Weekday" : "Weekend"));
		}
	}
}

