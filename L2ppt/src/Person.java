import java.util.Date;

public class Person {
	String firstName;
	String lastName;
	int age;
	String address;
	
	public String toString() {
		String methodVariable = "Value of Person object";
		return 
				methodVariable + 
				"firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address;
				
	}
	
}
