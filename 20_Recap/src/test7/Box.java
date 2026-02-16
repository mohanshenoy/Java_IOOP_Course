package test7;

class Box {
	private double width;
	private double height;
	private double depth;
	static int boxCount = 0;
	
	// 1. STATIC VARIABLE: Shared by all Box objects
	static {
        System.out.println("--- Box Manufacturing Module Loaded ---");
        boxCount = 0; // Initialize counter
    }
	
    // 2. STATIC BLOCK: Runs once when class is loaded
    // Realistic Use: Loading configuration or drivers
    static {
        System.out.println("2. Second Static Block: Verifying configuration...");
        boxCount += 5; // Add 5 more
    }
	
    // 3. STATIC METHOD: Called without creating an object
    // Realistic Use: Utility/Validation logic
    static boolean validate(double width, double height, double depth) {
        if (width <= 0 || height <= 0 || depth <= 0) {
            System.out.println("Error: Dimensions must be positive.");
            return false;
        }
        return true;
    }
    
    
	double volume() {
		return (this.width*this.height*this.depth);
	}
	
	Box(double val){
		if (validate(val, val, val)) { // Use static method to check
			this.width = val;
			this.height = val;
			this.depth = val;
			boxCount++; // Increment static counter
		}
	}
	Box(double width, double height, double depth){
		if (validate(width, height, depth)) {
			this.width = width;
			this.height = height;
			this.depth = depth;	
			boxCount++;
		}
	}

	Box createNewBox(double val){
		Box box = new Box(val);
		return box;
	}
	
	void testMethod() {
		System.out.println("inside testMethod");
		return;
		//System.out.println("inside testMethod");
	}
	
	protected void finalize( ){
        System.out.println("inside finalize");
        boxCount--; // Decrement count when destroyed
	}

}
