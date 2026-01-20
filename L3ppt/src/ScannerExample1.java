import java.util.Scanner;
public class ScannerExample1 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		a = sc.nextInt();
		System.out.println("Enter 2nd number");
		b = sc.nextInt();		
		c = a+ b;
		System.out.println("Sum of a , b is:"+c);
	}
}
