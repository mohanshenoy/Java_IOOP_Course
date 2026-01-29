/*
 * Available in JDK14 onwards​
notice here, there is no "break" here,,,,,,​
they didn't deprecate old pattern to support backward ​compatibility​
​no break required ....no fall through ​
switch expression ..returns value​
possible to declare same variable in multiple blocks
 */
enum DayOfTheWeek {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,  SATURDAY, SUNDAY;
}
public class SwitchExpression1 {
	public static void main(String[] args) {
		DayOfTheWeek today = DayOfTheWeek.SATURDAY;
		String result = switch (today) {
			case SATURDAY, SUNDAY -> "It's the weekend! :)";
			default -> "It's a weekday :(";
		};
		System.out.println(result);
	}
}

