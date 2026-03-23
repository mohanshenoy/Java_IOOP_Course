package slide14;
class Animal {
    public void move() {
        System.out.println("Animals can move");
    }
}
class Cat extends Animal {
    public void move() {
        System.out.println("Cats can walk and run");
    }
}
public class TestCat {
    public static void main(String args[]) {
        Animal a = new Animal(); // Animal object
        Animal c = new Cat();    // Cat object
        Animal a1;   // Animal reference
        a1 = c;      // Animal reference but Cat object
        a.move();   // runs the method in Animal class
        a1.move();   // runs the method in Cat class
    }
}