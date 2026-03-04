public class Slide79 {
    public static void main(String[] args) {
    	String input = "p1.java  p1.c  p2.java  c2.java     p3.java ";
        String[] parts = input.split("\\s+");
        int count = 0;
        for (String word : parts) {
            if (word.toLowerCase().endsWith(".java")) {
                count++;
            }
        }
        System.out.println("Number of java file names: " + count);
    }
}