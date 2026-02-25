package slide28;

class TwoDShape { // a superclass reference can refer to a subclass object
    private double width;
    private double height;
    // Construct an object from an object.
    TwoDShape(TwoDShape ob) { // TwoDShape reference is pointing to
        width = ob.width;     // Triangle class object
        height = ob.height;
    }
    // Standard constructor for initialization
    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }
}
// A subclass of TwoDShape for triangles.
class Triangle extends TwoDShape {
    private String style;
    // Standard constructor
    Triangle(String s, double w, double h) {
        super(w, h);
        style = s;
    }
    // Construct an object from an object.
    Triangle(Triangle ob) {
        super(ob); // pass object to TwoDShape constructor
        style = ob.style;
    } 
}
class Shapes7 {
    public static void main(String args[]) {
        Triangle t1 = new Triangle("outlined", 8.0, 12.0);
        // make a copy of t1
        Triangle t2 = new Triangle(t1);
        TwoDShape twoDShape = t2;
    } 
}