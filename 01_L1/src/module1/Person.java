package module1;

import java.util.Date;

public class Person {
	String firstName;
	String lastName;
	Date dataOfBirth;
	int age;
	String address;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String firstName, String lastName, Date dataOfBirth, int age, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dataOfBirth = dataOfBirth;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		return "(firstName=" + firstName + ", lastName=" + lastName + ", dataOfBirth=" + dataOfBirth + ", age="
				+ age + ", address=" + address + ")";
	}
	
	
}
