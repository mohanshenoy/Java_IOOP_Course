
public class Q3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
class Person{ 
	String firstName = "Arun"; 
	String lastName = "Gupta"; 
	public Person(String fn, String ln) { 
		this.firstName = fn; 
		this.lastName = ln; 
	}
} 
class Demo { 
	public static void main(String[] args) { 
		Person p = new Person(); 
		System.out.println("Name is : "+p.firstName+" "+p.lastName); 
	}
} 
