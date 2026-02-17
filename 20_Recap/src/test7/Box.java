package test7;

class Box {
	private double width;
	private double height;
	private double depth;
	
	//recap static variables, static block, static method
	//recap non static block
	//recap inner block
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// STATIC VARIABLE: Shared by all Box objects
	static int boxCount = 0;
	
	static {
		System.out.println("first Static Block...");
        boxCount = 0; // Initialize counter
    }
    static {
        System.out.println("Second Static Block...");
        boxCount += 1; // Add 5 more
    }
    static {
        System.out.println("Third Static Block...");
        boxCount += 1; // Add 5 more
    }	
    
    // STATIC METHOD: Called without creating an object
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
		boxCount++;
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
