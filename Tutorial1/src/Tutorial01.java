
public class Tutorial01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}