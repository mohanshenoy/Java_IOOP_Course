public class AdditonalExcercise06_1 {
    public static void main(String[] args) {
        System.out.println("Combinations (Duplication Allowed):");
        for (int i = 1; i <= 4; i++) {         // Thousands place
            for (int j = 1; j <= 4; j++) {     // Hundreds place
                for (int k = 1; k <= 4; k++) { // Tens place
                    for (int l = 1; l <= 4; l++) { // Units place
                        System.out.println("" + i + j + k + l);
                    }
                }
            }
        }
    }
}