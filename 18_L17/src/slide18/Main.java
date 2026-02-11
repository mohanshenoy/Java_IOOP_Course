package slide18;

class Parent {
    void display() {
        System.out.println("This is the parent class.");
    }
}
class Child1 extends Parent {
    void showChild1() {
        System.out.println("This is child 1.");
    }
}
class Child2 extends Parent {
    void showChild2() {
        System.out.println("This is child 2.");
    }
}
public class Main {
    public static void main(String[] args) {
        Child1 obj1 = new Child1();
        Child2 obj2 = new Child2();

        obj1.display(); // Inherited from Parent
        obj1.showChild1();

        System.out.println("");
        
        obj2.display(); // Inherited from Parent
        obj2.showChild2();
    }
}