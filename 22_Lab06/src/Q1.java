
/**
 * Write a menu driven java program to do the following
 * 1) To check whether a string is palindrome or not
 * 2) Write the string in an alphabetical order
 * 3) Reverse the string
 * 4) Concatenate the original string and the reversed string
 */
import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println(" >>>>>> String Operations Menu <<<<<<< ");
            System.out.println("1) To check whether a string is palindrome or not");
            System.out.println("2) Write the string in an alphabetical order");
            System.out.println("3) Reverse the string");
            System.out.println("4) Concatenate the original string and the reversed string");
            System.out.println("5) Exit"
            System.out.println(" >>>>>> String Operations Menu <<<<<<< ");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline left-over

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter a string: ");
                String str = sc.nextLine();
                String reversed = new StringBuilder(str).reverse().toString();

                switch (choice) {
                    case 1:
                        if (str.equals(reversed))
                            System.out.println("Result: It is a Palindrome.");
                        else
                            System.out.println("Result: Not a Palindrome.");
                        break;
                    case 2:
                        char[] chars = str.toCharArray();
                        Arrays.sort(chars);
                        System.out.println("Sorted: " + new String(chars));
                        break;
                    case 3:
                        System.out.println("Reversed: " + reversed);
                        break;
                    case 4:
                        System.out.println("Concatenated : " + str + " : "+ reversed);
                        break;
                }
            } else if (choice != 5) {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
        System.out.println("Exiting program.");
        sc.close();
    }
}