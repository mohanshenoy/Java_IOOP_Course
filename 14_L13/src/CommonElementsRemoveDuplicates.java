public class CommonElementsRemoveDuplicates {
    public static void main(String[] args) {
        int[] arr1 = {4, 3, 7, 0, 2, 7};
        int[] arr2 = {7, 2, 9, 7, 5};
        int[] result = new int[arr1.length+ arr2.length];
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    // Check if already in result array to avoid duplicates
                    boolean exists = false;
                    for (int k = 0; k < count; k++) {
                        if (result[k] == arr1[i]) {
                            exists = true;
                            break;
                        }
                    }
                    if (!exists) {
                        result[count++] = arr1[i];
                    }
                }
            }
        }
        for (int i = 0; i < count ; i++) {
        	System.out.print(result[i] + " ");
		}
    }
}