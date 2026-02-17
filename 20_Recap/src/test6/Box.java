package test6;

class Box {
	private double width;
	private double height;
	private double depth;
	
	double volume() {
		return (this.width*this.height*this.depth);
	}
	
	Box(Box b){
		this.width = b.width;
		this.height = b.height;
		this.depth = b.depth;		
	}
	Box(){
		this.width = 1;
		this.height = 1;
		this.depth = 1;		
	}
	Box(double val){
		this.width = val;
		this.height = val;
		this.depth = val;
	}
//	Box(double val){
//		this(val,val,val);
//	}
	Box(double width, double height, double depth){
		this.width = width;
		this.height = height;
		this.depth = depth;		
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
	}

	//add equals method
	//recap == , .equals
	
	
	
	
	
	
	
	
	public boolean equals(Box b) {
		if(this.width ==b.width && this.height ==b.height && this.depth ==b.depth) return true;
		else return false;
	}

	
}
