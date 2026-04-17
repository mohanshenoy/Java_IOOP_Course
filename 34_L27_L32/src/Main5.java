class Main5 {
	public static void main(String[] args) {
		try {
			int array[] = new int[10];
			//array[11] = 100;
			array[10] = 30 / 0;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}