public class Example {
    public void method() {
        System.out.println("Outer method");
        // Local block
        {
            int localVariable = 10;
            System.out.println("Inner block, localVariable: " + localVariable);
        }
        // Trying to declare a static block here would cause a compilation error.
        // static {
        // System.out.println("Static block in a method? Not allowed!");
        // }
    }
    public static void main(String[] args) {
        Example example = new Example();
        example.method();
    }
}