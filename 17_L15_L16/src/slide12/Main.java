package slide12;

class Outer {
    private String message = "Hello from Outer class";

    class Inner {
        void display() {
            // Directly accessing the private member of the Outer class
            System.out.println(message); 
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner(); 
        inner.display();
    }
}