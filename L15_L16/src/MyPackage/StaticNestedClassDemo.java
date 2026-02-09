package MyPackage;

class OuterClass {
    static String staticMessage = "This is static data";
    String instanceMessage = "This is instance data";
    
    static void outerClassStaticMethod() {
    	System.out.println("inside outerClassStaticMethod...");
    }
    void outerClassMethod() {
    	System.out.println("inside outerClassMethod...");
    }
    // Static Nested Class
    static class StaticNested {
        void printMessage() {
            // Can access static members of OuterClass
            System.out.println("Accessing: " + staticMessage);
            
            // Can access static method of OuterClass directly
            outerClassStaticMethod();
            
            // CanNOT access non-static method of OuterClass directly
            //outerClassMethod();
            
            // CanNOT access non-static members directly
            //System.out.println(instanceMessage); // gives a compilation error
        }
    }
}
public class StaticNestedClassDemo {
    public static void main(String[] args) {
        // You do NOT need an object of OuterClass to create the nested class
        OuterClass.StaticNested nestedObject = new OuterClass.StaticNested();
        nestedObject.printMessage();
    }
}
