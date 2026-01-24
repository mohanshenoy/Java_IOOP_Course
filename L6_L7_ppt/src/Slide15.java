// Parent class defining the general interface
class Shape {
    void draw() {
        System.out.println("Drawing a generic shape");
    }
}

// Subclasses providing specific implementations (Overriding)
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle (using radius)");
    }
}

class Box extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Box (using height and width)");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Triangle (using three sides)");
    }
}

public class Slide15 {
    public static void main(String[] args) {
        // Create an array of different shapes, 
    	//This is possible because Circle, Box, and Triangle ARE-A Shape
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Box();
        shapes[2] = new Triangle();

        // The "One Interface" in action
        for (Shape s : shapes) {
            // The compiler knows Shape has a draw() method, and 
        	//the JVM selects the specific version at runtime.
            s.draw(); 
        }
    }
}