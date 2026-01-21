
public class FallThroughExample {
	public static void main(String[] args) {
		int a = 3;
		switch (a) {
	    case 0:
	    case 2:
	    case 4:
	    case 6:
	    case 8:
	    case 10:
	        System.out.println("a is an even number less than 10");
	        break;
	    case 1:
	    case 3:
	    case 5:
	    case 7:
	    case 9:
	        System.out.println("a is an odd number less than 10");
	        break;
	    default:
	        System.out.println("a is greater than 10");
		}
	}
}
