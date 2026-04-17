public class FinallyExample {
    public static void main(String[] args) {
        try {
            int data = 10 / 0; // This will cause an exception
            System.out.println("This will not be printed.");
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}