package test4;

class Box {
	private double width; 
	private double height;  
	private double depth;  
	
	double volume() {
		return (this.width*this.height*this.depth);
	}
	
	// add a new parameterised method "setDimensions" passing only one parameter, which invokes
	//also show this.setDimensions(double width, double height, double depth)
	
	//add parameterised method passing a Box object, which set values 	
	
	//make variables private
	
	
	
	
	
	
	
	
	
	
	
	
	void setDimensions(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}


}
