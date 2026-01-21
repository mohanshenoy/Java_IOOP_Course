public class GreatCommonDivisor {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        System.out.println("GCD of " + a + " and " + b + " is: " + 
        findGCD(a, b));
    }
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b; // Get the remainder
            a = temp;  // The old 'b' becomes the new 'a'
        }
        return a;
    }
}