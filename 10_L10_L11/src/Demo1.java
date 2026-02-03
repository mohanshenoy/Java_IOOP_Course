class A1 {
    int N;
    public static void increment(A1 obj) {
        obj.N++; // Using an Object Reference
    }
}
public class Demo1 {
    public static void main(String args[]) {
        A1 obj1 = new A1();
        A1 obj2 = new A1();
        A1 obj3 = new A1();
        obj1.N = 3;
        obj2.N = 4;
        obj3.N = 5;
        A1.increment(obj1); // Calling the static method with object references 
        A1.increment(obj2);
        A1.increment(obj3);
        System.out.println(obj1.N); 
        System.out.println(obj2.N); 
        System.out.println(obj3.N); 
    }
}