package slide4;

class OuterClass {
    // Member variable of the outer class
    private String message = "Hello from the Outer Class!";
    // Nested class
    class InnerClass {
        // Method in the nested class
        void displayMessage() {
            System.out.println(message); // Accessing the outer class's member
        }
    }
    // Method in the outer class to use the inner class
    void createInner() {
        InnerClass inner = new InnerClass(); // Creating an instance of the inner class
        inner.displayMessage();
    }
}
public class InnerMain {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass(); // Creating an instance of the outer class
        outer.createInner(); // Invoking the outer class's method
    }
}