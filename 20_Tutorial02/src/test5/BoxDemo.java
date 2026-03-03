package test5;

public class BoxDemo {

	public static void main(String[] args) {
		Box box1 = new Box(10);
		System.out.println("box1 volume is "+ box1.volume());
		
		Box box2 = new Box(20);
		System.out.println("box2 volume is "+ box2.volume());
		
		box2 = box1;
		System.out.println("box2 volume is "+ box2.volume());
		
		Box box3 = box2.createNewBox(30);
		System.out.println("box3 volume is "+ box3.volume());
		
		System.gc();
	}
}
