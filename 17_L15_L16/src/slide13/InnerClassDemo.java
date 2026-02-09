package slide13;

class Outer {
    int outer_x = 100;
    
    //this is an inner class
    class Inner {
        void display() {
            System.out.println("outer_x = " + outer_x);
        }
    }
    void test() {
        Inner inner = new Inner();
        inner.display();
    }
}
class InnerClassDemo {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
    }
}