import java.util.Arrays;

/**
 * 4.	Write a Java program to rotate the elements of an array to the right/left  
 * by a given number of steps. The program should handle arrays of different sizes 
 * and should be able to rotate the array in both directions (left and right).
 */

import java.util.Scanner;

public class ArrayRotator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] arr = {10, 20, 30, 40, 50};
        
        System.out.print("Original Array: "); 
        printArray(arr);
        
        System.out.print("\nEnter steps: "); 
        int steps = scanner.nextInt();
        
        System.out.print("Direction (left/right): "); 
        String direction = scanner.next();
        
        rotateArray(arr, steps, direction);
        
        System.out.print("Rotated Array:  "); 
        printArray(arr);
    }

    public static void rotateArray(int[] arr, int steps, String direction) {
        int arrayLength = arr.length;
        if (arrayLength == 0) return;
        steps = steps % arrayLength;

        for (int i = 0; i < steps; i++) {
            if (direction.equalsIgnoreCase("right")) {
                int last = arr[arrayLength - 1];
                for (int j = arrayLength - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = last;
            } else {
                int first = arr[0];
                for (int j = 0; j < arrayLength - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arrayLength - 1] = first;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}