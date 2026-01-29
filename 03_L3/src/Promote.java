
public class Promote {

	public static void main(String[] args) {
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = .1234;
		double result = (f*b)+(i/c)-(d*s);
		System.out.println("result is :"+result);
		
		float res1 = f*b;
		System.out.println("res1 is :"+res1);
		
		int res2 = i/c;
		System.out.println("res2 is :"+res2);
		
		double res3 = d*s;
		System.out.println("res3 is :"+res3);
		

	}

}
