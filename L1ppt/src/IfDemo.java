
public class IfDemo {

	public static void main(String[] args) {
		int a, b; 
//		a = 2; 
//		b = 3; 
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		if(a < b) 
			System.out.println(a + " is less than " + b); 
		if(a == b) 
			System.out.println(a + " is equal to " + b); 
	}

}
