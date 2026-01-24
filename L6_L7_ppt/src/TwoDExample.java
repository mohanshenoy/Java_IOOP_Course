public class TwoDExample {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int totalSum = 0;

        // Nested loop to access every element
        for (int i = 0; i < matrix.length; i++) {       // Rows
            for (int j = 0; j < matrix[i].length; j++) { // Columns
                totalSum += matrix[i][j];
            }
        }

        System.out.println("The total sum of the matrix is: " + totalSum);
    }
}