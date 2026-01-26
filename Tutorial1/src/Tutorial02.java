
public class Tutorial02 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2},
            {3, 4, 5}
        };
        for (int x=0 ; x < matrix.length ; x++) {
        	for(int y=0 ; y < matrix[x].length; y++) {
                System.out.print((matrix[x][y] * matrix[x][y]) + " ");
            }
        }
    }
}