public class Slide34_5 {
    public static void main(String[] args) {
        int num = 12321;
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
    public static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed = (reversed * 10) + digit;
            n = n / 10;
        }
        return original == reversed;
    }
}