

/**
 * Write a Java program that counts the number of vowels in a given string.​
 */
public class VowelCounter {
    public static void main(String[] args) {
        String input = "Hello World";
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels: " + vowelCount);
    }

    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}