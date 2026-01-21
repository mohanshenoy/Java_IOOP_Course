public class Slide34_2 {
	
    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        System.out.println("GCD of " + a + " and " + b + " is: " + 
        findGCD(a, b));
    }
    public static int findGCD(int a, int b) {
        while (b != 0) {
        	int temp = b;
        	int r = a % b; // Get the remainder
        	a = temp; // old 'b' becomes the new 'a'
        	b = r; // old 'b' becomes remainder
        }
        return a;
    }
}