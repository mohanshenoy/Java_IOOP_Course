import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        scanner.close();

        String[] words = input.split(" ");
        String reversedString = "";

        for (String word : words) {
            char[] charArray = word.toCharArray();
            String reversedWord = "";
            for (int i = charArray.length - 1; i >= 0; i--) {
                reversedWord += charArray[i];
            }
            reversedString += reversedWord + " ";
        }

        System.out.println("Reversed string: " + reversedString.trim());
    }
}