
/*
 * Create a class with integer array of size 10 and write methods 
 * ....to perform following.
 * Use Switch case to accept choice from the user. 
 * Input values into an array
 * Display the values
 * Display the largest value
 * Display the average 
 * Sort the array in ascending order 
 */

import java.util.Scanner;

public class AdditionalExercise1  {
	public static void main(String[] args) {
	}
}


class ArrayOperations {
    private int[] arr = new int[10];
    private Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) arr[i] = sc.nextInt();
    }

    public void display() {
        System.out.print("Array elements: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }

    public void displayLargest() {
        int max = arr[0];
        for (int i = 1; i < 10; i++) if (arr[i] > max) max = arr[i];
        System.out.println("Largest value: " + max);
    }

    public void displayAverage() {
        double sum = 0;
        for (int x : arr) sum += x;
        System.out.println("Average: " + (sum / 10));
    }

    public void sortAscending() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array sorted successfully.");
    }

    public static void main(String[] args) {
        ArrayOperations obj = new ArrayOperations();
        Scanner menuScanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1.Input 2.Display 3.Largest 4.Average 5.Sort 6.Exit");
            System.out.print("Enter choice: ");
            choice = menuScanner.nextInt();

            switch (choice) {
                case 1 -> obj.input();
                case 2 -> obj.display();
                case 3 -> obj.displayLargest();
                case 4 -> obj.displayAverage();
                case 5 -> obj.sortAscending();
                case 6 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid selection.");
            }
        } while (choice != 6);
    }
}
