
public class Person {
	String firstName;
	String lastName;
	
	public Person() {
		
	}
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
//	boolean equals(Person p) {
//		if(this.firstName == p.firstName && this.lastName == p.lastName) return true;
//		else return false;
//	}
//	
}
