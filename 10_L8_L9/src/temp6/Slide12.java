package temp6;

public class Slide12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

class Box {
    double width;
    double height;
    double depth;
    Box(double w, double h, double d) // parameter passing
    {
        width = w;
        height = h;
        depth = d;
    }
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo4 {
    public static void main(String args[]) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}
