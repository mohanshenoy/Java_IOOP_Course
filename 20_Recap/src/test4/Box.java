package test4;

class Box {
	private double width;
	private double height;
	private double depth;
	
	double volume() {
		return (this.width*this.height*this.depth);
	}
	
	void setDimensions(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
}
