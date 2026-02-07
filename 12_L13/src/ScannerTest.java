import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String s = sc.nextLine();
		System.out.println("Entered string value :"+s);
		
		
		System.out.println("Enter a int:");
		int i  = sc.nextInt();
		System.out.println("Entered int  value :"+i);
		
		sc.nextLine();
		
		System.out.print("Enter a string:");
		s = sc.nextLine();
		System.out.println(".................");
		System.out.println("Entered string value :"+s);
		
	}

}
