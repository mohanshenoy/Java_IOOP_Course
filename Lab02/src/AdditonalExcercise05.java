import java.util.Scanner;

public class AdditonalExcercise05 {
    public static void main(String[] args) {
        // Initializing array at the time of declaration
        int[] a = {1, 2, 3, 1, 2, 1, 5, 6, 7};
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value to be searched: ");
        int searchValue = input.nextInt();
        
        System.out.print("The value is found at locations: ");
        
        int index = 0; // Manual counter to track the index
        boolean found = false;

        // For-each loop construct
        for (int element : a) {
            if (element == searchValue) {
                System.out.print("a[" + index + "] ");
                found = true;
            }
            index++; // Increment index in every iteration
        }

        if (!found) {
            System.out.println("Value not found in the array.");
        }
        
        input.close();
    }
}