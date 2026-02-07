package package1;

public class AccessTest {
	public static void main(String[] args) {
		Test ob = new Test();
		ob.a = 10;
		ob.b = 20;
		//ob.c = 100;  
		//ob.setC(100);  // You must access c through its methods
		//System.out.println("a, b, and c: " + ob.a + " " + ob.b + " " + ob.getC());
	}
}