public class LoopBreak {
	public static void main(String[] args) {
        boolean running = true;
        int x = 5, y = 10;
        for (int i = 0; i < 10; i++) {
            while (running) {
                if (x < y) break;
            }
            System.out.println("After while");
        }
        System.out.println("After for");
	}
}
