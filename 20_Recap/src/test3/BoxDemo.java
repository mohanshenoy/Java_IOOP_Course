package test3;

public class BoxDemo {

	public static void main(String[] args) {
		Box box1 = new Box();
		box1.width=10;
		box1.height=10;
		box1.depth=10;
		//invoke volume method
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("volume is "+ box1.volume());
		
		Box box2 = new Box();
		box2.width=20;
		box2.height=20;
		box2.depth=20;
		System.out.println("volume is "+ box2.volume());
		
		box2 = box1;
		System.out.println("volume is "+ box2.volume());
	}

}
