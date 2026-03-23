package slide20;
abstract class Shape {
    abstract void draw();
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle");
    }
}
class Circle extends Shape {
    void draw() {
        System.out.println("drawing circle");
    }
}
// In real scenario, method is called by programmer or user
public class TestAbstraction {
    public static void main(String args[]) {
    	//Shape s = new Shape();
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        r.draw();
        c.draw();
        
        Shape s=new Circle();// abstract reference variable “s”
        s.draw(); 
        
        //Shape s1 = new Shape();1
    }
}