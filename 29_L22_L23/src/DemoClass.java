interface A {
    void meth1();
}

interface B extends A {
    void meth2();
}

class MyClass implements B {
    public void meth1() {
        System.out.println("Implement meth1().");
    }

    public void meth2() {
        System.out.println("Implement meth2().");
    }
}
public class DemoClass {
    public static void main(String arg[]) {
    	MyClass ob = new MyClass();
        ob.meth1();
        ob.meth2();
    }
}