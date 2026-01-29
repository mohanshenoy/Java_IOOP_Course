public class Excercise04 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = 3; // Size of the square matrix
        int sum = 0;

        System.out.println("Non-Principal Diagonal Elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Condition for non-principal diagonal: i + j == size - 1
                if (i + j == n - 1) {
                    System.out.print(matrix[i][j] + " ");
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println("\nSum of Non-Principal Diagonal Elements: " + sum);
    }
}