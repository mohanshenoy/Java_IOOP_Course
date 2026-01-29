import java.util.Arrays;

/**
 * 4.	Write a Java program to rotate the elements of an array to the right/left  
 * by a given number of steps. The program should handle arrays of different sizes 
 * and should be able to rotate the array in both directions (left and right).
 */
public class Exercise04_1 {
	
    public static void main(String[] args) {
    	
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array" + Arrays.toString(arr));
        
        rotate(arr, 2, "right");  
        System.out.println("Right: " + Arrays.toString(arr));
        
        int[] arr2 = {1, 2, 3, 4, 5};
        rotate(arr2, 2, "left");  
        System.out.println("Left: " + Arrays.toString(arr2));
    }

    public static void rotate(int[] nums, int k, String direction) {
        int n = nums.length;
        k %= n;
        if (!direction.equalsIgnoreCase("right")) k = n - k;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}