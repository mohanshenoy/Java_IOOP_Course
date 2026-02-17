package test5;

class Box {
	private double width;
	private double height;
	private double depth;
	
	
	double volume() {
		return (this.width*this.height*this.depth);
	}
	
	//recap default constructor
	//add parameterised/overloaded construtors,   
	//recap explicit return
	//recap finalize, show slide
	

	Box(double val){
		this.width = val;
		this.height = val;
		this.depth = val;			
	}
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

}
