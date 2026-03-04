public class Slide66 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("User: ");
        sb.append("Manoj");      // Appending a String
        sb.append(' ');         // Appending a char
        sb.append(25);          // Appending an int
        sb.append(" Status: "); 
        sb.append(true);        // Appending a boolean
        System.out.println(sb.toString()); 
   }
}
