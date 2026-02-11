class TwoDShape {
    double width; // change to private and show
    double height; // change to private and show

//    void setWidth(double w) { 
//    	width = w; 
//    }
//    double getWidth() { 
//    	return width; 
//    }
//    void setHeight(double h) { 
//    	height = h; 
//    }
//    double getHeight() { 
//    	return height; 
//    }
    
    void showDim() {
        System.out.println("Width and height are " + this.width + " and " + this.height);
    }
    
}
class Triangle extends TwoDShape {
    String style;
    double area() {
        return (width * height) / 2; 
    }
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
public class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.width = 4.0;
        t1.height = 4.0;
        t1.style = "filled";

        t2.width = 8.0;
        t2.height = 12.0;
        t2.style = "outlined";

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
        
        System.out.println();
        
        System.out.println("Info for shape: ");
        TwoDShape shape = new TwoDShape();
        //shape.style="filled";
        shape.width=2.0;
        shape.height=3.0;
        shape.showDim();
    }
}