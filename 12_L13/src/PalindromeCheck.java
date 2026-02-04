
/**
 * Write a Java program that checks if a given string is a palindrome.​
 */
public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "malayalam";
        boolean isPalindrome = true;
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}