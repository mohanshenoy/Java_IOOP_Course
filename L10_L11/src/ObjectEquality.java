
public class ObjectEquality {

	public static void main(String[] args) {
		Person p1 = new Person("Siddanth","Gupta");
		Person p2 = new Person("Siddanth","Gupta");
		
		System.out.println("p1==p1 :"+(p1==p1));
		System.out.println("p1==p2 :"+(p1==p2));
		
		System.out.println("p1.equals(p1) : "+ p1.equals(p1));
		System.out.println("p1.equals(p2) : "+ p1.equals(p2));

	}

}
