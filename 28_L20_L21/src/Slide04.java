class A1 { // Method overriding
    int i, j;
    A1(int a, int b) {
        i = a;
        j = b;
    }
    void show() { // display i and j
        System.out.println("i and j: " + i + " " + j);
    }
}
class B1 extends A1 {
    int k;
    B1(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show() { // display k – this overrides show() in A
        System.out.println("overridden : " + k);
    }
    // signature is different, overload show()
    void show(String msg) { 
        System.out.println(msg + " : " + k);  
    }
}
public class Slide04 {
    public static void main(String args[]) {
        B1 subOb = new B1(1, 2, 3);
        subOb.show();           // this calls overridden show() in B
        subOb.show("overloaded"); // this calls overloaded show()
    }
}