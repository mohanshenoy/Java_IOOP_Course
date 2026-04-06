public class Main4 {
    static void test(int a, int b) throws ArithmeticException {
        int r = a / b;
        System.out.println("No exception " + r);
    }
    public static void main(String[] args) {
        try { 
            test(15, 0);
        }
        catch(ArithmeticException e) {
            System.out.println("caught in main." + e); 
        } 
    }
}