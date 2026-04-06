public class Program2 {
    public static void main(String args[]) {
        try {
            int a = 8 / 2;
        } catch (Exception e) {
            System.out.println("error" + e);
        } finally {
            System.out.println("finally");
        }
        System.out.println("successful");
    }
}