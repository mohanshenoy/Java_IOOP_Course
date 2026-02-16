package test7;

public class BoxDemo {

	public static void main(String[] args) {
		
		System.out.println("Initial Box Count: " + Box.boxCount);
		
		Box box1 = null;
        // 1. Using Static Validation before creation
        if (Box.validate(10, 20, 30)) {
            box1 = new Box(10, 20, 30);
            System.out.println("box1 volume is "+ box1.volume());
        }
        
        Box box2 = new Box(20);
        System.out.println("Box2 volume is  " + box2.volume());
		
		Box box3 = new Box(30);
		System.out.println("box3 volume is "+ box3.volume());
		
        // Accessing Static Variable
        System.out.println("Total Boxes Created: " + Box.boxCount);
        
		Box box4 = new Box(40);
		System.out.println("box4 volume is "+ box4.volume());
		
		Box box5 = box2.createNewBox(50);
		System.out.println("box5 volume is "+ box5.volume());
		
        // Accessing Static Variable
        System.out.println("Total Boxes Created: " + Box.boxCount);
        
        // Trigger Garbage Collection request
        box1 = null;
        box2 = null;
        box3 = null;
		System.gc();
	}
}
