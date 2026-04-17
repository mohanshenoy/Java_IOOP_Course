public class FinallyWithReturn {
    static int test() {
        try {
            System.out.println("Inside try block.");
            return 10;
        } catch (Exception e) {
            System.out.println("Inside catch block.");
        } finally {
            System.out.println("Finally block executed.");
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("Returned Value: " + test());
    }
}