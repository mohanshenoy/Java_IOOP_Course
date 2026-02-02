class Box {
	double width;
    double height;
    double depth;

    Box(Box ob) {
        this.width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons2 {
    public static void main(String args[]) {
        Box mybox1 = new Box(2, 2, 2);
        double vol1 = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol1);
        
        Box mybox2 = new Box();
        double vol2 = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol2);       
        
        Box mycube = new Box(7);
        double vol3 = mycube.volume();
        System.out.println("Volume of mycube is " + vol3);    

        Box myclone = new Box(mybox1);
        double vol4 = myclone.volume();
        System.out.println("Volume of myclone is " + vol4); 
        
    }
}