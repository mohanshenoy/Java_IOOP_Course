

public class AnotherClass {

	public static void main(String[] args) {
		package1.Test ob = new package1.Test();
		ob.a = 10;
		ob.b = 20;
		//ob.c = 100;  

		ob.setC(100);  // You must access c through its methods
		System.out.println("a, b, and c: " + ob.a + " " + ob.b + " " + ob.getC());
	}
}
