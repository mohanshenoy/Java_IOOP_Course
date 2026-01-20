
public class ArrayProgram3 {
	public static void main(String[] args) {
	 int a[] = {10,20,30};
	 int b[];
	 b=a;
	 System.out.println("array a ="+a[0]+" "+a[1]+" "+a[2]+" ");
	 System.out.println("array b ="+b[0]+" "+b[1]+" "+b[2]+" ");
	 b[1]=500;
	 System.out.println("array a ="+a[0]+" "+a[1]+" "+a[2]+" ");
	 System.out.println("array b ="+b[0]+" "+b[1]+" "+b[2]+" ");
	}
}
