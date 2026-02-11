package slide17;

class Grandparent {
    void showGrandparent() {
        System.out.println("This is the grandparent class.");
    }
}
class Parent extends Grandparent {
    void showParent() {
        System.out.println("This is the parent class.");
    }
}
class Child extends Parent {
    void showChild() {
        System.out.println("This is the child class.");
    }
}
public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.showGrandparent(); // Method from Grandparent
        obj.showParent();      // Method from Parent
        obj.showChild();       // Method from Child
    }
}