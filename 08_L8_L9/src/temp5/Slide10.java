package temp5;

public class Slide10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

class Box {
	double width;
	double height;
	double depth;
	Box(){
		System.out.println("Constructing a Box");
		//Setup the default values
		width = 10; height= 20; depth = 30;
	}
	double volume() {
		return width * height * depth;
	}
}

class BoxDemo3 {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}
