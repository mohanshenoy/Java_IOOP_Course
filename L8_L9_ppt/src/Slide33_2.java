
public class Slide33_2 {
	public static void main(String[] args) {
	}
}

class Swapper {
    int x;
    int y;
    public Swapper(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void swap() {
        int temp = x;
        x = y;
        y = temp;
    }
}

class SwapperDemo {
    public static void main(String[] args) {
        Swapper s = new Swapper(10, 20);
        System.out.println("Before swap:");
        System.out.println("x: " + s.getX());
        System.out.println("y: " + s.getY());
        s.swap();
        System.out.println("\nAfter swap:");
        System.out.println("x: " + s.getX());
        System.out.println("y: " + s.getY());
    }
}