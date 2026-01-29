
public class Reverse {
	public static void main(String[] args) {
		int num =789, rev;
		System.out.println("original number "+num);
		rev = reverseMethod(num);
		System.out.println("reversed number "+rev);
			
	}
	public static int reverseMethod(int num) {
		int rev = 0;
		while(num!=0) {
			int digit = num % 10; //get last digit from number
			rev= rev*10 + digit;
			num = num / 10;
		}
		return rev;
	}
}
