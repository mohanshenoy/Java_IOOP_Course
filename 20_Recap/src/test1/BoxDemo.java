package test1;

public class BoxDemo {

	public static void main(String[] args) {
		Box box1 = new Box();
		box1.width=10;
		box1.height=10;
		box1.depth=10;
		System.out.println("box1 volume is :"+(box1.width * box1.height * box1.depth));
		
		Box box2 = new Box();
		box2.width=20;
		box2.height=20;
		box2.depth=20;
		System.out.println("box2 volume is :"+(box2.width * box2.height * box2.depth));
		
		box2 = box1;
		System.out.println("box2 volume is :"+(box2.width * box2.height * box2.depth));
	}

}
