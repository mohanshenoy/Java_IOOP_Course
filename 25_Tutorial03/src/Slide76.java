public class Slide76 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" is").append(" fun!");

        // Converting StringBuffer to a regular String
        String result = sb.toString();

        System.out.println(result.toUpperCase()); 
        // Output: JAVA IS FUN!
    }
}