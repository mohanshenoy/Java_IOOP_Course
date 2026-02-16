package test4;

public class BoxDemo {

	public static void main(String[] args) {
		Box box1 = new Box();
		box1.setDimensions(10,10,10);
		System.out.println("volume is "+ box1.volume());
		
		Box box2 = new Box();
		box2.setDimensions(20,20,20);
		System.out.println("volume is "+ box2.volume());
		
		box2 = box1;
		System.out.println("volume is "+ box2.volume());
	}

}
