public class Example2 {
	public static void main(String[] args) {
		 int a = 10, b = 15;
		 if (a++ > 10) {
		     if (b-- > 10) {
		         System.out.println("X");
		     } else {
		         System.out.println("Y");
		     }
		 } else {
		     if (++b > 15) {
		         System.out.println("Z");
		     } else {
		         System.out.println("W");
		     }
		 }
		 System.out.println("a: " + a + ", b: " + b);
	}
}
