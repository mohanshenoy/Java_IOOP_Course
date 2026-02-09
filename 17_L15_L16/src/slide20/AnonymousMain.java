package slide20;

interface Greeting {
    void sayHello();
}
public class AnonymousMain {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() { // Anonymous Inner Class
            @Override
            public void sayHello() {
                System.out.println("Hello, welcome to the Java world!");
            }
        };
        greeting.sayHello();
    }
}