package module1;

import java.util.Date;

public class PersonTestClass {

	public static void main(String[] args) {
		Person personObject = new Person();
		System.out.println("show personObject details.."+personObject.toString());
		
		System.out.println("");
		
		Person priyatham = new Person("Priyatham", "CR", new Date(), 18, "India");
		System.out.println("show priyatham details.."+priyatham.toString());
			
	}

}
