public class Tutorial04 {
    public static void main(String[] args) {
        outer: for (int x1 = 1; x1 <= 2; x1++) {
            for (int x2 = 1; x2 <= 2; x2++) {
                if (x2 == 2) {
                    continue outer;
                }
                System.out.print(x1 + "" + x2 + " ");
            }
        }
    }
}