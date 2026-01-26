package temp4;
public class Slide43 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

//parameterized method.
class Box {
    double width;
    double height;
    double depth;
    double volume() {
    	return width*height*depth;
    }
    void setDim(double w, double h, double d) {
    	width = w;
    	height = h;
    	depth = d;
    }
}
