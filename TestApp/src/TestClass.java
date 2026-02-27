
public class TestClass {
	static String t = "Java";
	public static void main(String[] args) {
		String s1 ="Java";
		String s2 ="Java";
		String s3 =new String("Java");
		System.out.println(t==s1);
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	}

}
