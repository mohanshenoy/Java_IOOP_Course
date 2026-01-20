import java.util.Scanner;
public class ArrayProgram5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of elements in the array");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter "+size+" elements");
		for (int i = 0; i < size; i++) {
			System.out.print("Element"+(i+1)+":");
			a[i] = sc.nextInt();
		}
		System.out.println("The elements in the array are");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		sc.close(); //updated
	}
}
