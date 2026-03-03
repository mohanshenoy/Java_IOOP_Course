
public class Slide35 {
    public static void main(String[] args) {
    	String a = "Hello"; 
    	String b = "Hello"; 
    	System.out.println(a == b); // true (Same reference in pool)
    	
    	String c = new String("Hello");
    	System.out.println(a == c); // false (c is a new object in heap)
    }
}
