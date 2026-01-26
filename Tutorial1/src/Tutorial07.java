public class Tutorial07 {
    public static void main(String[] args) {
        first: for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (k == 1) continue first;
                    System.out.print(i + "" + j + "" + k + " ");
                }
            }
        }
    }
}