package test2;

class Box {
	double width;
	double height;
	double depth;
	
	void volume() {
		System.out.print("volume is ");
		System.out.println("box1 volume is :"+(this.width*this.height*this.depth));
	}
}
