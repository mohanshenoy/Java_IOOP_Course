

public class Tutorial12 {
    public static void main(String[] args) {
        for (int x = 0; x < 3; x++) {
            inner: for (int y = 0;y < 3; y++) {
                if (x == 1) break inner;
                System.out.println(x * y);
            }
        }
    }
}
