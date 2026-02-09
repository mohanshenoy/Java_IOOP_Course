public class ManualMergeSort {
    public static void main(String[] args) {
        int[] arr1 = {12, 5, 87};
        int[] arr2 = {45, 2, 19};
        int[] merged = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }
        // Bubble Sort Algorithm
        for (int i = 0; i < merged.length - 1; i++) {
            for (int j = 0; j < merged.length - i - 1; j++) {
                if (merged[j] > merged[j + 1]) {
                    int temp = merged[j];
                    merged[j] = merged[j + 1];
                    merged[j + 1] = temp;
                }
            }
        }
    }
}