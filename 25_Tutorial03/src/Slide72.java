public class Slide72 {
    public static void main(String[] args) {
    	StringBuffer sb = new StringBuffer("Manipal Instititute of Technology");
    	sb.delete(8, 23);
    	System.out.println("After delete: " + sb);
    	sb.deleteCharAt(0);
    	System.out.println("After deleting CharAt: " + sb);
   }
}
