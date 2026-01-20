
enum DayOfTheWeek {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,  SATURDAY, SUNDAY;
}
public class Example5 {
	public static void main(String[] args) {
		DayOfTheWeek today = DayOfTheWeek.SATURDAY;
		String result = switch (today) {
			case SATURDAY, SUNDAY -> "It's the weekend! :)";
			default -> "It's a weekday :(";
		};
		System.out.println(result);
	}
}

