/*
 * 1.	Create an abstract class Figure with an abstract method area and 
 * two integer variables that represent x and y dimensions. 
 * Create three more classes Rectangle, Triangle and Square that 
 * extend Figure and implement the area method appropriately. 
 * Illustrate how the method area can be computed at run time 
 * for Rectangle, Square and Triangle to achieve dynamic polymorphism.
 * 
 */
abstract class Figure {
    int dim1;  
    int dim2;  

    Figure(int a, int b) {
        dim1 = a;
        dim2 = b;
    }

    abstract void area();
}

class Rectangle extends Figure {
    Rectangle(int a, int b) {
        super(a, b);
    }

    @Override
    void area() {
        System.out.println("Area of Rectangle: " + (dim1 * dim2));
    }
}

class Triangle extends Figure {
    Triangle(int a, int b) {
        super(a, b);
    }

    @Override
    void area() {
        System.out.println("Area of Triangle: " + (0.5 * dim1 * dim2));
    }
}

class Square extends Figure {
    Square(int s) {
        super(s, s);
    }

    @Override
    void area() {
        System.out.println("Area of Square: " + (dim1 * dim2));
    }
}

public class DynamicPolyDemo {
    public static void main(String[] args) {
        Figure figRef;

        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(10, 8);
        Square s = new Square(6);

        figRef = r;
        figRef.area(); 

        figRef = t;
        figRef.area(); 

        figRef = s;
        figRef.area(); 
    }
}