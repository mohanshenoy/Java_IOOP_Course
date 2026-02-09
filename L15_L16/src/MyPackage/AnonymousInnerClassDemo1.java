package MyPackage;

interface Greeter1 {
    void sayHello();
}
public class AnonymousInnerClassDemo1 {
    public static void main(String[] args) {
        // Lambda Expression: () represents arguments, -> points to the body
        Greeter1 guest = () -> System.out.println("Hello, Guest!");
        guest.sayHello();
    }
}
