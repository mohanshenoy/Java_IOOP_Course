
public class TestClient17 {

	public static void main(String[] args) {
		byte b;
		int i = 257;
		double d = 257.257;
		b = (byte) i; System.out.println("i = " + i + ", b = " + b);
		i = (int) d; System.out.println("d = " + d + ", i = " + i);
		b = (byte) d; System.out.println("d = " + d + ", b = " + b);

	}

}
