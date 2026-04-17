class Parent {
    void display() {
        System.out.println("This is the parent class.");
    }
    void showChild() {
    		System.out.println("Nothing to print");
    }
}
class Child1 extends Parent {
    void showChild() {
        System.out.println("This is child 1.");
    }
}
class Child2 extends Parent {
    void showChild() {
        System.out.println("This is child 2.");
    }
}
public class DemoClass {
    public static void main(String[] args) {
    		Parent p = new Child1();
    		p.display();
    		p.showChild();
    		p = new Child2();
    		p.display();
    		p.showChild();
    }
}