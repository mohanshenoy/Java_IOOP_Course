package MyPackage;

interface Greeter {
    void sayHello();
}
public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        // Defining an Anonymous Inner Class that implements Greeter
        Greeter guest = new Greeter() {
            @Override
            public void sayHello() {
                System.out.println("Hello, Guest!");
            }
        }; // Semicolon is required to end the statement
        guest.sayHello();
    }
}
