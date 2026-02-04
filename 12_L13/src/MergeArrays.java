
/**
 * Write a Java program to merge two arrays into a single array.​
 */
public class MergeArrays {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {6, 7, 8, 9, 10};

        int firstLength = firstArray.length;
        int secondLength = secondArray.length;
        int[] mergedArray = new int[firstLength + secondLength];

        for (int i = 0; i < firstLength; i++) {
            mergedArray[i] = firstArray[i];
        }

        for (int i = 0; i < secondLength; i++) {
            mergedArray[firstLength + i] = secondArray[i];
        }

        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}