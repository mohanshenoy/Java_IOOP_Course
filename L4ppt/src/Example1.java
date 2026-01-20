public class Example1 {
	public static void main(String[] args) {
		int x = 5;
		if (x % 2 == 0) {
		    if (x > 0) {
		        System.out.println("Positive Even");
		    } else {
		        System.out.println("Negative Even");
		    }
		} else if (x % 3 == 0) {
		    System.out.println("Divisible by 3");
		} else {
		    System.out.println("Odd Number");
		}
	}
}
