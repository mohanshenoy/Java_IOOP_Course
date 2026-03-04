
public class Slide35 {
    public static void main(String[] args) {
    	String a = "Hello"; 
    	String b = "Hello"; 
    	System.out.println(a == b); // true (Same reference in pool)
    	
    	String c = new String("Hello");
    	System.out.println(a == c); // false (c is a new object in heap)

		String s1 ="Java";
		String s2 ="java";
		System.out.println(s1==s2);

		String s3 =new String("Java");
		System.out.println(s1==s3);
    }
}
