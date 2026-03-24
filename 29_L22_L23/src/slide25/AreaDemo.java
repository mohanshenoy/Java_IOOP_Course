package slide25;

interface Area {
    float findArea(int a, int b);
}
class Rectangle implements Area {
    public float findArea(int x, int y) {
        return x * y;
    }
}
class Triangle implements Area {
    public float findArea(int x, int y) {
        return (float)(0.5*x*y);
    }
}
public class AreaDemo {
    public static void main(String[] args) {
    	Rectangle r = new Rectangle();
    	Triangle t = new Triangle();
    	Area a;
    	
    	a = r;
    	System.out.println("Area of rectangle ="+a.findArea(10,20));
    	
    	a= t;
    	System.out.println("Area of triangle ="+a.findArea(5,10));
    }
}