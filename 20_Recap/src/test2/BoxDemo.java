package test2;

public class BoxDemo {

	public static void main(String[] args) {
		Box box1 = new Box();
		box1.width=10;
		box1.height=10;
		box1.depth=10;
		//invoke volume method
		
		
		
		
		
		
		
		
		
		
		
		box1.volume();
		
		Box box2 = new Box();
		box2.width=20;
		box2.height=20;
		box2.depth=20;
		box2.volume();
		
		box2 = box1;
		box2.volume();
	}

}
