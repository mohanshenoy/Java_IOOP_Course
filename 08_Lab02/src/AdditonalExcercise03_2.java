
public class AdditonalExcercise03_2 {
    public static void main(String[] args) {
    	int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            // Inner loop prints the current 'num' exactly 'num' times
            for (int j = 1; j <= num; j++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}