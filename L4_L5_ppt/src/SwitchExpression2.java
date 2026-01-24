/*
 * you can define ENUM value ​, 
In Java, an enum (short for enumeration) is a special data type used to define a collection of constants. ​
Unlike simple integers or strings, enums are type-safe, meaning the compiler ensures a variable only holds one of the predefined values. ​
Internally, enums are specialized classes that can include fields, methods, and even constructors to store additional data for each constant. ​
They are commonly used for fixed sets like days of the week, compass directions, or application states. ​
Because they are objects, you can iterate over them using the values() method or use them efficiently in switch statements.​
Key Features​
Type Safety: Prevents invalid values from being assigned to a variable.​
Functionality: Can contain logic and data, such as an isWeekend() method on a Day enum.​
Singleton Pattern: Each enum constant is a public, static, final instance of the enum type​
 */
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
public class SwitchExpression2 {
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

